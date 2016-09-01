package cn.hotleave.leetcode;

/**
 * https://leetcode.com/problems/game-of-life/
 *
 * @author hotleave
 */
public class GameOfLife289 {
    /**
     * Given a board with m by n cells, each cell has an initial state live (1) or dead (0). Each cell interacts with its eight neighbors (horizontal, vertical, diagonal) using the following four rules (taken from the above Wikipedia article):
     * <p>
     * 1. Any live cell with fewer than two live neighbors dies, as if caused by under-population.
     * 2. Any live cell with two or three live neighbors lives on to the next generation.
     * 3. Any live cell with more than three live neighbors dies, as if by over-population..
     * 4. Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
     * <p>
     * Write a function to compute the next state (after one update) of the board given its current state.
     *
     * @param board
     */
    public void gameOfLife(int[][] board) {
        if (board == null || board.length == 0) {
            return;
        }

        // 复制数据
        int[][] copy = new int[board.length][board[0].length];
        int[] ints;
        for (int i = 0; i < board.length; i++) {
            ints = board[i];
            System.arraycopy(ints, 0, copy[i], 0, ints.length);
        }

        int ml = board.length;
        int nl = board[0].length;
        int m = 0;
        int n;
        int lives;
        int state;
        boolean mm1In, ma1In, nm1In, na1In;
        for (; m < ml; m++) {
            for (n = 0; n < nl; n++) {
                lives = 0;
                mm1In = m - 1 >= 0;
                ma1In = m + 1 < ml;
                nm1In = n - 1 >= 0;
                na1In = n + 1 < nl;

                if (mm1In) {
                    if (nm1In) {
                        // NW
                        lives += board[m - 1][n - 1];
                    }
                    // N
                    lives += board[m - 1][n];
                    if (na1In) {
                        // NE
                        lives += board[m - 1][n + 1];
                    }
                }
                if (nm1In) {
                    // W
                    lives += board[m][n - 1];
                }
                if (na1In) {
                    // E
                    lives += board[m][n + 1];
                }

                if (ma1In) {
                    if (nm1In) {
                        // SW
                        lives += board[m + 1][n - 1];
                    }
                    // S
                    lives += board[m + 1][n];
                    if (na1In) {
                        // SE
                        lives += board[m + 1][n + 1];
                    }
                }

                // current status
                state = board[m][n];
                switch (lives) {
                    case 0:
                    case 1:
                        // Any live cell with fewer than two live neighbors dies, as if caused by under-population.
                        copy[m][n] = 0;
                        break;
                    case 2:
                        break;
                    case 3:
                        // Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
                        if (state == 0) {
                            copy[m][n] = 1;
                        }
                        break;
                    default:
                        // Any live cell with more than three live neighbors dies, as if by over-population..
                        copy[m][n] = 0;
                }
            }
        }


        // copy back to board
        for (int i = 0; i < board.length; i++) {
            ints = copy[i];
            System.arraycopy(ints, 0, board[i], 0, ints.length);
        }
    }
}
