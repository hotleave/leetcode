package cn.hotleave.leetcode;

/**
 * https://leetcode.com/problems/basic-calculator-ii/
 *
 * @author hotleave
 */
public class BasicCalculatorII227 {
    /**
     * Implement a basic calculator to evaluate a simple expression string.
     * <p>
     * The expression string contains only non-negative integers, +, -, *, / operators and empty spaces . The integer division should truncate toward zero.
     * You may assume that the given expression is always valid.
     *
     * @param s
     * @return
     */
    public int calculate(String s) {
        return calculate(s, '+');
    }

    private int calculate(String s, char operator) {
        s = s.trim();
        try {
            return Integer.valueOf(s);
        } catch (NumberFormatException e) {
        }
        String[] clauses = s.split("[" + operator + "]");
        int subtotal = 0;
        switch (operator) {
            case '+':
                for (String clause : clauses) {
                    subtotal += calculate(clause, '-');
                }
                break;
            case '-':
                for (int i = 0; i < clauses.length; i++) {
                    String clause = clauses[i];
                    subtotal += i == 0 ? calculate(clause, '*') : -calculate(clause, '*');
                }
                break;
            case '*':
                if (s.contains("*") || s.contains("/")) {
                    char[] chars = s.toCharArray();
                    int number;
                    char opt = 0;
                    for (int i = 0; i < chars.length; i++) {
                        char c = chars[i];

                        switch (c) {
                            case '*':
                            case '/':
                                opt = c;
                                break;
                            case ' ':
                            case '\t':
                                break;
                            default:
                                boolean loop = false;
                                number = 0;
                                while (c >= 48 && c <= 57) {
                                    loop = true;
                                    number = number * 10 + c - 48;
                                    if (++i >= chars.length) {
                                        break;
                                    }
                                    c = chars[i];
                                }
                                if (loop) {
                                    i--;
                                }

                                if (opt > 0) {
                                    if ('*' == opt) {
                                        subtotal *= number;
                                    } else {
                                        subtotal /= number;
                                    }
                                } else {
                                    subtotal = number;
                                }
                        }
                    }


                } else {
                    return getNumber(s.trim());
                }
                break;

        }
        return subtotal;
    }


    private int getNumber(String str) {
        return Integer.valueOf(str);
    }
}
