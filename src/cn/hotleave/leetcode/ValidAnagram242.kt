package cn.hotleave.leetcode

/**
 *
 *
 * @author hotleave
 * @date 2018/6/12
 */
class ValidAnagram242 {

    /**
     * Example 1:
     *
     * Input: s = "anagram", t = "nagaram"
     * Output: true
     *
     * Example 2:
     *
     * Input: s = "rat", t = "car"
     * Output: false
     */
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }

        if (s == t) {
            return true
        }

        val first = s.toCharArray()
        val second = t.toCharArray()

        first.sort()
        second.sort()

        return first.contentEquals(second)
    }

    fun isAnagram2(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }

        if (s == t) {
            return true
        }

        val array = IntArray(26)
        for (char in s) {
            ++array[char - 'a']
        }

        for (char in t) {
            if (--array[char - 'a'] < 0) {
                return false
            }
        }

        return true
    }
}