package cn.hotleave.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author hotleave
 */
public class NQueensII52Test {
    @Test
    public void totalNQueens() throws Exception {
        NQueensII52 solution = new NQueensII52();
        assertEquals(1, solution.totalNQueens(1));
        assertEquals(2, solution.totalNQueens(4));
        assertEquals(10, solution.totalNQueens(5));
    }

}