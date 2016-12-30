package cn.hotleave.leetcode;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by hotleave on 16-12-28.
 */
public class CountTofSmallerNumbersAfterSelf315Test {
    @Test
    public void countSmaller() throws Exception {
        CountTofSmallerNumbersAfterSelf315 solution = new CountTofSmallerNumbersAfterSelf315();

        List<Integer> result = solution.countSmaller(new int[]{5, 2, 6, 1});
        System.out.println(result);

        InputStream is = getClass().getResourceAsStream("/315.txt");
        byte[] data = new byte[is.available()];
        is.read(data);

        String arrays = new String(data);
        String[] values = arrays.split(",");
        int[] nums = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            String value = values[i];
            nums[i] = Integer.valueOf(value.trim());
        }

        long start = System.currentTimeMillis();
        result = solution.countSmaller(nums);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        System.out.println(result);
    }
}