package cn.hotleave.leetcode;

/**
 * https://leetcode.com/problems/unique-paths/
 *
 * @author hotleave
 */
public class UniquePaths62 {
    /**
     * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
     * <p>
     * The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
     * <p>
     * How many possible unique paths are there?
     *
     * @param m
     * @param n
     * @return
     */
    public int uniquePaths(int m, int n) {
        // 根据递归逻辑， uniquePaths(m,n) = uniquePaths(m-1, n) + uniquePaths(m, n-1);

        // 用数组保存m-1行各列的uniquePaths结果
        int[] numbers = new int[n];
        numbers[0] = 1;

        for (int i = 0; i < m; i++) {
            // uniquePaths(x, 1) == 1, 故不再重复计算第一列
            for (int j = 1; j < n; j++) {
                // 更新当前行各列的uniquePath数
                numbers[j] = numbers[j] + numbers[j - 1];
            }
        }

        return numbers[n - 1];
    }

    private int badUniquePaths(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }

        return badUniquePaths(m - 1, n) + badUniquePaths(m, n - 1);
    }
}
