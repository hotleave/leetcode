package cn.hotleave.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author hotleave
 */
public class BasicCalculator224Test {
    @Test
    public void calculate() throws Exception {
        BasicCalculator224 solution = new BasicCalculator224();
        assertEquals(2, solution.calculate("1 + 1"));
        assertEquals(3, solution.calculate("  2-1 + 2"));
        assertEquals(23, solution.calculate("(1+(4+5+2)-3)+(6+8)"));

        assertEquals(1, solution.calculate("(1-(4+5+2)-3)+(6+8)"));
        assertEquals(5, solution.calculate("(1-((4+(5-2)))-3)+(6+8)"));
        assertEquals(11, solution.calculate("(1-((4-(5-2)))-3)+(6+8)"));
        assertEquals(14, solution.calculate("(1-((4-(5-2)- 1) - 2)-3)+(6+8)"));

        assertEquals(-2147483648, solution.calculate("2147483648"));

        // submit fails
        assertEquals(2147483647, solution.calculate("2147483647"));
        assertEquals(-2147483647, solution.calculate("0-2147483647"));
    }

}