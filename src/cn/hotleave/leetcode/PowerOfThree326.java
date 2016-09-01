package cn.hotleave.leetcode;

/**
 * https://leetcode.com/problems/power-of-three/
 *
 * @author hotleave
 */
public class PowerOfThree326 {
    /**
     * Given an integer, write a function to determine if it is a power of three.
     *
     * @param n
     * @return
     */
    public boolean isPowerOfThree(int n) {
        return n == 1 || (n > 1 && n % 3 == 0 && isPowerOfThree(n / 3));
    }
}
