package cn.hotleave.leetcode;

/**
 * https://leetcode.com/submissions/detail/72647158/
 *
 * @author hotleave
 */
public class NQueensII52 {
    private int solutions;
    private int full;

    /**
     * Follow up for N-Queens problem.
     * <p>
     * Now, instead outputting board configurations, return the total number of distinct solutions.
     *
     * @param n
     * @return
     */
    public int totalNQueens(int n) {
        full = (1 << n) - 1;
        solutions = 0;

        findQueen(0, 0, 0);

        return solutions;
    }

    private void findQueen(int row, int leftDiagonal, int rightDiagonal) {
        if (row == full) {
            solutions++;
        } else {
            int status = full & (~(row | leftDiagonal | rightDiagonal));
            int lastQueen;
            while (status > 0) {
                lastQueen = status & (~status + 1);
                status -= lastQueen;

                findQueen(row | lastQueen, (leftDiagonal | lastQueen) << 1, (rightDiagonal | lastQueen) >> 1);
            }
        }
    }
}
