package cn.hotleave.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/n-queens/
 *
 * @author hotleave
 */
public class NQueens51 {
    private int full;
    private int count;
    private List<List<String>> results;
    private List<String> solution;

    /**
     * The n-queens puzzle is the problem of placing n queens on an n×n chessboard such that no two queens attack each other.
     * Given an integer n, return all distinct solutions to the n-queens puzzle.
     * <p>
     * Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space respectively.
     * <pre>
     * [
     *  [".Q..",  // Solution 1
     *   "...Q",
     *   "Q...",
     *   "..Q."],
     *
     *  ["..Q.",  // Solution 2
     *   "Q...",
     *   "...Q",
     *   ".Q.."]
     * ]
     * </pre>
     *
     * @param n
     * @return
     */
    public List<List<String>> solveNQueens(int n) {
        count = n;
        full = (1 << n) - 1;

        results = new ArrayList<>(n);
        solution = new ArrayList<>(n);

        char[] chars = new char[count];
        Arrays.fill(chars, '.');
        String dots = new String(chars);
        for (int i = 0; i < n; i++) {
            solution.add(dots);
        }

        findQueen(0, 0, 0, 0);

        return results;
    }

    private void findQueen(int row, int leftDiagonal, int rightDiagonal, int index) {
        if (row == full) {
            List<String> cur = new ArrayList<>(count);
            cur.addAll(solution);
            results.add(cur);
        } else {
            // status中为1的位，表示可以放置皇后
            int status = full & (~(row | leftDiagonal | rightDiagonal));
            int lastPosition;
            while (status > 0) {
                // status中最后一个1及其后的0
                lastPosition = status & (~status + 1);
                // 从可用位置中删除这个位置
                status -= lastPosition;

                // 写到结果当中
                putQueen(lastPosition, index, 'Q');
                // 查找下一行, 在row和两个对角线中都增加新增加的位
                findQueen(row | lastPosition, (leftDiagonal | lastPosition) << 1, (rightDiagonal | lastPosition) >> 1, index + 1);
                // clear when fail
                putQueen(lastPosition, index, '.');
            }
        }
    }

    private void putQueen(int pos, int index, char value) {
        int col = 0;
        while ((pos & 1) == 0) {
            pos >>= 1;
            col++;
        }

        char[] chars = solution.get(index).toCharArray();
        chars[col] = value;

        solution.set(index, new String(chars));
    }
}
