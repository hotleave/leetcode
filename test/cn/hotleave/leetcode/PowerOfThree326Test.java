package cn.hotleave.leetcode;

import cn.hotleave.leetcode.PowerOfThree326;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author hotleave
 */
public class PowerOfThree326Test {
    @Test
    public void isPowerOfThree() throws Exception {
        PowerOfThree326 solution = new PowerOfThree326();

        for (int i = 0; i < 20; i++){
            int num = (int) Math.pow(3, i);
            assertTrue(solution.isPowerOfThree(num));
        }

        assertFalse(solution.isPowerOfThree(36));
    }
}