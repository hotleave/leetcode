package cn.hotleave.leetcode;

import cn.hotleave.leetcode.GameOfLife289;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author hotleave
 */
public class GameOfLife289Test {
    @Test
    public void gameOfLife() throws Exception {
        GameOfLife289 solution = new GameOfLife289();
        int[][] board = new int[3][3];
        board[0][0] = 1;

        solution.gameOfLife(board);
        assertEquals(0, board[1][1]);


        board[0][0] = 1;
        board[0][1] = 1;
        board[1][0] = 1;
        board[2][0] = 1;
        board[1][1] = 1;
        solution.gameOfLife(board);
        assertEquals(0, board[1][1]);
    }
}