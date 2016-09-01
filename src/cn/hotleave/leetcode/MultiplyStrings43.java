package cn.hotleave.leetcode;

/**
 * https://leetcode.com/problems/multiply-strings/
 *
 * @author hotleave
 */
public class MultiplyStrings43 {
    /**
     * Given two numbers represented as strings, return multiplication of the numbers as a string.
     *
     * @param num1
     * @param num2
     * @return
     */
    public String multiply(String num1, String num2) {
        String ZERO = "0";
        String ONE = "1";
        if (ZERO.equals(num1) || ZERO.equals(num2)) {
            return ZERO;
        }

        if (ONE.equals(num1)) {
            return num2;
        }

        if (ONE.equals(num2)) {
            return num1;
        }

        char[] number1 = num1.toCharArray();
        char[] number2 = num2.toCharArray();

        int l1 = number1.length - 1;
        int l2 = number2.length - 1;

        int i;
        boolean needConvert;
        char[] finalResult = new char[l1 + l2 + 2];

        for (int j = l2; j >= 0; j--) {
            // 转换成实际数值
            number2[j] -= 48;
            needConvert = j == l2;

            for (i = l1; i >= 0; i--) {
                if (needConvert) {
                    number1[i] -= 48;
                }

                finalResult[i + j + 1] += number1[i] * number2[j];
            }
        }

        // 处理进位，并转换成char
        for (int k = finalResult.length - 1; k >= 0; k--) {
            i = finalResult[k];
            if (i > 9) {
                finalResult[k - 1] += i / 10;
                finalResult[k] = (char) (i % 10 + 48);
            } else {
                finalResult[k] += 48;
            }
        }

        return finalResult[0] == '0' ? new String(finalResult, 1, finalResult.length - 1) : new String(finalResult);
    }
}
