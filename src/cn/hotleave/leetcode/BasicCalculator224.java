package cn.hotleave.leetcode;

import java.util.Stack;

/**
 * https://leetcode.com/problems/basic-calculator/
 *
 * @author hotleave
 */
public class BasicCalculator224 {
    /**
     * Implement a basic calculator to evaluate a simple expression string.
     * <p>
     * The expression string may contain open ( and closing parentheses ), the plus + or minus sign -, non-negative integers and empty spaces .
     * You may assume that the given expression is always valid.
     *
     * @param s
     * @return
     */
    public int calculate(String s) {
        char[] chars = s.toCharArray();
        Stack<Boolean> stack = new Stack<>();

        // current
        boolean sign = true;
        // ranger
        boolean rangeSign = true;
        int total = 0;
        stack.push(true);

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            switch (c) {
                case ' ':
                case '\t':
                    break;
                case '-':
                    // when negative, current sign is opposite to range sign
                    sign = !rangeSign;
                    break;
                case '+':
                    // when positive, current sign is same to range sign
                    sign = rangeSign;
                    break;
                case '(':
                    // meet parentheses, push current ranger sign to stack
                    rangeSign = sign;
                    stack.push(rangeSign);
                    sign = rangeSign;
                    break;
                case ')':
                    // meet closing parentheses, pop stack, and get the range sign
                    stack.pop();
                    rangeSign = stack.peek();
                    break;
                default:
                    int tmp = 0;
                    boolean loop = false;

                    // read the number
                    while (c >= 48 && c <= 57) {
                        loop = true;

                        tmp = tmp * 10 + c - 48;
                        if (++i >= chars.length) {
                            break;
                        }

                        c = chars[i];
                    }
                    if (loop) {
                        i--;
                    }

                    // add to the result
                    total += sign ? tmp : -tmp;
            }
        }

        return total;
    }
}
