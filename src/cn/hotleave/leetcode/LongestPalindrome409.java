package cn.hotleave.leetcode;

/**
 * Created by hotleave on 2016/10/10.
 */
public class LongestPalindrome409 {
    public int longestPalindrome(String s) {
        // f() = s.chartAt(i) - 65
        // 58 = 26lower + 26upper + 6punctuation
        int[] table = new int[58];
        char[] chars = s.toCharArray();
        for (char c : chars) {
            c = (char) (c - 65);
            table[c]++;
        }

        int odd = 0;
        for (int i : table) {
            if ((i & 1) == 1) {
                odd++;
            }
        }

        return s.length() - (odd > 0 ? odd - 1 : 0);
    }
}
