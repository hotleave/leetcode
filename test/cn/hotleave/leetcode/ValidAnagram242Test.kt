package cn.hotleave.leetcode

import org.junit.Assert.*
import org.junit.Test

/**
 * @author hotleave
 * @date 2018/6/12
 */
class ValidAnagram242Test {

    @org.junit.Test
    fun isAnagram() {
        val solution = ValidAnagram242()
        var s = "anagram"
        var t = "nagaram"

        assertTrue(solution.isAnagram(s, t))

        s = "a"
        t = "b"
        assertFalse(solution.isAnagram(s, t))
    }

    @Test
    fun isAnagram2() {
        val solution = ValidAnagram242()
        var s = "anagram"
        var t = "nagaram"

        assertTrue(solution.isAnagram2(s, t))

        s = "a"
        t = "b"
        assertFalse(solution.isAnagram2(s, t))
    }
}