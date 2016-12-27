package cn.hotleave.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author hotleave
 */
public class BasicCalculatorII227Test {
    @Test
    public void calculate() throws Exception {
        BasicCalculatorII227 solution = new BasicCalculatorII227();
        assertEquals(2, solution.calculate("1 + 1"));
        assertEquals(0, solution.calculate("1 - 1"));
        assertEquals(1, solution.calculate("1 / 1"));
        assertEquals(1, solution.calculate("1 * 1"));
        assertEquals(0, solution.calculate("1 / 2"));
        assertEquals(6, solution.calculate("3 * 2 - 1 / 2"));
        assertEquals(1, solution.calculate("1*2*3/4"));
        assertEquals(5, solution.calculate("1*2+3*3/4-3*2+6-2+1*3"));
    }

}