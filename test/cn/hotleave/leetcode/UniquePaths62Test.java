package cn.hotleave.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author hotleave
 */
public class UniquePaths62Test {
    @Test
    public void uniquePaths() throws Exception {
        UniquePaths62 solution = new UniquePaths62();
        assertEquals(70, solution.uniquePaths(5, 5));
        assertEquals(985525432, solution.uniquePaths(20, 20));


        // submit fail
        assertEquals(2, solution.uniquePaths(2, 2));
        assertEquals(1, solution.uniquePaths(1, 1));
    }

}