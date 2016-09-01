package cn.hotleave.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author hotleave
 */
public class WiggleSubsequence376Test {
    @Test
    public void wiggleMaxLength() throws Exception {
        WiggleSubsequence376 solution = new WiggleSubsequence376();
        assertEquals(6, solution.wiggleMaxLength(new int[]{1, 7, 4, 9, 2, 5}));
        assertEquals(7, solution.wiggleMaxLength(new int[]{1, 17, 5, 10, 13, 15, 10, 5, 16, 8}));
        assertEquals(2, solution.wiggleMaxLength(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
        assertEquals(1, solution.wiggleMaxLength(new int[]{0, 0, 0}));

        // fail the test
        assertEquals(1, solution.wiggleMaxLength(new int[]{0, 0}));
        assertEquals(3, solution.wiggleMaxLength(new int[]{3, 3, 3, 2, 5}));
    }

}