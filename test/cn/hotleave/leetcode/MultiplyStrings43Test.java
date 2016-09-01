package cn.hotleave.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author hotleave
 */
public class MultiplyStrings43Test {
    @Test
    public void multiply() throws Exception {
        MultiplyStrings43 solution = new MultiplyStrings43();
        assertEquals("1", solution.multiply("1", "1"));
        assertEquals("0", solution.multiply("0", "1"));
        assertEquals("9", solution.multiply("3", "3"));
        assertEquals("891", solution.multiply("9", "99"));
        assertEquals("121932631112635269", solution.multiply("123456789", "987654321"));
        assertEquals("999999998000000001", solution.multiply("999999999", "999999999"));
    }

}