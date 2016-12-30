package cn.hotleave.leetcode;

import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.*;

/**
 * Created by hotleave on 16-12-30.
 */
public class BestTimeToBuyAndSellStock121Test {
    @Test
    public void maxProfit() throws Exception {
        BestTimeToBuyAndSellStock121 solution = new BestTimeToBuyAndSellStock121();
        int[] prices = new int[] {7, 6, 4, 3, 1};
        int profit = solution.maxProfit(prices);
        assertEquals(0, profit);

        prices = new int[]{7, 1, 5, 3, 6, 4};
        profit = solution.maxProfit(prices);
        assertEquals(5, profit);

        prices = new int[] {998, 999, 10, 80, 2, 6, 5, 3, 50, 70, 12, 86, 66, 36, 1};
        profit = solution.maxProfit(prices);
        assertEquals(84, profit);

        prices = new int[0];
        profit = solution.maxProfit(prices);
        assertEquals(0, profit);

        InputStream is = getClass().getResourceAsStream("/121.txt");
        byte[] buffer = new byte[is.available()];
        is.read(buffer);
        String[] str = new String(buffer).split(",");
        prices = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            String s = str[i];
            prices[i] = Integer.valueOf(s.trim());
        }

        profit = solution.maxProfit(prices);
        assertEquals(3, profit);
    }

}