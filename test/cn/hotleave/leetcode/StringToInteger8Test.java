package cn.hotleave.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author hotleave
 */
public class StringToInteger8Test {
    @Test
    public void myAtoi() throws Exception {
        StringToInteger8 solution = new StringToInteger8();
        assertEquals(0, solution.myAtoi(null));
        assertEquals(0, solution.myAtoi(""));

        assertEquals(0, solution.myAtoi("abc"));
        assertEquals(0, solution.myAtoi("+abc"));

        assertEquals(0, solution.myAtoi("+0"));
        assertEquals(0, solution.myAtoi("-0"));

        assertEquals(1, solution.myAtoi("1"));
        assertEquals(1, solution.myAtoi("+1"));
        assertEquals(1, solution.myAtoi("+1a"));
        assertEquals(-1, solution.myAtoi("-1a"));

        assertEquals(0, solution.myAtoi("a+1"));
        assertEquals(0, solution.myAtoi("+ 2"));
        assertEquals(0, solution.myAtoi("+\t2"));

        assertEquals(0, solution.myAtoi(" \t+\t2"));
        assertEquals(-2147483648, solution.myAtoi("-2147483649"));

        // submit fails
        assertEquals(0, solution.myAtoi("+-2"));
        assertEquals(2147483647, solution.myAtoi("2147483648"));
    }

}