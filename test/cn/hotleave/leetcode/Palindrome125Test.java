package cn.hotleave.leetcode;

import cn.hotleave.leetcode.Palindrome125;

import static org.junit.Assert.*;

/**
 * @author hotleave
 */
public class Palindrome125Test {
    @org.junit.Test
    public void isPalindrome() throws Exception {
        Palindrome125 solution = new Palindrome125();
        assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"));

        assertFalse(solution.isPalindrome("race a car"));

        assertTrue(solution.isPalindrome(""));

        assertTrue(solution.isPalindrome(null));

        assertTrue(solution.isPalindrome("a"));

        assertTrue(solution.isPalindrome("aa"));

        assertTrue(solution.isPalindrome("aba"));

        assertFalse(solution.isPalindrome("0P"));
    }

}