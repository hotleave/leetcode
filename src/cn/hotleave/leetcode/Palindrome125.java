package cn.hotleave.leetcode;

/**
 * https://leetcode.com/problems/valid-palindrome/
 * @author hotleave
 */
public class Palindrome125 {
    /**
     * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
     * <p>
     * <p>
     * For example,
     * "A man, a plan, a canal: Panama" is a palindrome.
     * "race a car" is not a palindrome.
     * <p>
     * Note:
     * Have you consider that the string might be empty? This is a good question to ask during an interview.
     * <p>
     * For the purpose of this problem, we define empty string as valid palindrome.
     *
     * @param s the string to check
     * @return true - is palindrome, false - is not
     */
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }

        char[] chars = s.toCharArray();
        int length = chars.length;
        char c1 = 0;
        char c2 = 0;
        int p1 = 0;
        int p2 = length - 1;

        while (p2 >= p1) {
            if (c1 == 0) {
                c1 = chars[p1++];
                // 48 - 57 = number, 65 - 90 = upper case, 97 - 122 = lowercase
                if (!((c1 >= 48 && c1 <=57) || (c1 >= 65 && c1 <= 90) || (c1 >= 97 && c1 <= 122))) {
                    c1 = 0;
                }
            }

            if (c2 == 0) {
                c2 = chars[p2--];
                if (!((c2 >= 48 && c2 <=57) || (c2 >= 65 && c2 <= 90) || (c2 >= 97 && c2 <= 122))) {
                    c2 = 0;
                }
            }

            if (c1 != 0 && c2 != 0) {
                if (c1 >= 65 && c1 <= 90) {
                    c1 = (char) (c1 + 32);
                }

                if (c2 >= 65 && c2 <= 90) {
                    c2 = (char) (c2 + 32);
                }
                // compare the pair when they are ready
                if (c1 != c2) {
                    return false;
                } else {
                    // walk through next pair
                    c1 = 0;
                    c2 = 0;
                }
            }
        }

        return true;
    }
}
