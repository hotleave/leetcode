package cn.hotleave.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author hotleave
 */
public class MaximumGap164Test {
    @Test
    public void maximumGap() throws Exception {
        MaximumGap164 solution = new MaximumGap164();

        assertEquals(10, solution.maximumGap(new int[] {3, 5, 8, 1, 18, 6, 2, 20, 25}));
    }

}