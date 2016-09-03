package cn.hotleave.leetcode;

/**
 * https://leetcode.com/problems/string-to-integer-atoi/
 *
 * @author hotleave
 */
public class StringToInteger8 {
    public int myAtoi(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }

        char[] chars = str.toCharArray();
        double result = 0;
        int sign = 1;
        // weather next char should be number
        boolean needNumber = false;
        boolean isNumber;

        loop:
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            isNumber = c >= 48 && c <= 57;

            if (needNumber && !isNumber) {
                break;
            }

            switch (c) {
                case '+':
                    if (!needNumber) {
                        sign = 1;
                        needNumber = true;
                    }
                    break;
                case '-':
                    if (!needNumber) {
                        sign = -1;
                        needNumber = true;
                    }
                    break;
                case ' ':
                case '\t':
                    break;
                default:
                    if (isNumber) {
                        needNumber = true;
                        result = result * 10 + c - 48;
                    } else {
                        break loop;
                    }
            }
        }

        return Double.valueOf(sign * result).intValue();
    }
}
