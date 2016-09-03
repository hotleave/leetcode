package cn.hotleave.leetcode;

import java.util.Stack;

/**
 * https://leetcode.com/problems/unique-paths-ii/
 *
 * @author hotleave
 */
public class UniquePathsII63 {
    private int paths;
    private int[][] grid;
    private int bm;
    private int bn;
    private byte[] right = new byte[]{0, 1};
    private byte[] down = new byte[]{1, 0};
    private Stack<int[]> stack = new Stack<>();

    /**
     * Now consider if some obstacles are added to the grids. How many unique paths would there be?
     * <p>
     * An obstacle and empty space is marked as 1 and 0 respectively in the grid.
     *
     * @param obstacleGrid
     * @return
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // 根据递归逻辑， uniquePaths(m,n) = uniquePaths(m-1, n) + uniquePaths(m, n-1);

        if (obstacleGrid.length == 0) {
            return 0;
        }

        // 用数组保存m-1行各列的uniquePaths结果
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[] numbers = new int[n];
        numbers[0] = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // 更新当前行各列的uniquePath数
                if (obstacleGrid[i][j] == 1) {
                    // 如果当前有阻拦，则到此的路径数为0
                    numbers[j] = 0;
                } else if (j > 0) {
                    numbers[j] = numbers[j] + numbers[j - 1];
                }
            }
        }

        return numbers[n - 1];
    }

    public int uniquePathsWithObstaclesBad(int[][] obstacleGrid) {
        grid = obstacleGrid;
        bm = grid.length - 1;
        bn = grid[0].length - 1;

        walk(0, 0);

        return paths;
    }

    private void walk(int m, int n) {
        boolean canWalkDown, canWalkRight;
        while (m <= bm && n <= bn) {
            if (m == bm && n == bn) {
                paths++;

                if (stack.isEmpty()) {
                    break;
                }

                int[] pos = stack.pop();

                // walk down
                m = pos[0] + 1;
                n = pos[1];
            }

            canWalkDown = canWalk(m, n, down);
            canWalkRight = canWalk(m, n, right);

            if (canWalkDown && canWalkRight) {
                stack.push(new int[] {m, n});
                n += 1;
            } else if (canWalkRight) {
                n += 1;
            } else if (canWalkDown) {
                m += 1;
            }
        }
    }

    private boolean canWalk(int m, int n, byte[] dir) {
        m += dir[0];
        n += dir[1];

        return (m <= bm && n <=bn && grid[m][n] == 0);
    }

}
