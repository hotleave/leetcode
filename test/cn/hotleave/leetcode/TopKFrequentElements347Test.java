package cn.hotleave.leetcode;

import org.junit.Test;

import java.util.List;

/**
 * Created by hotleave on 16-12-27.
 */
public class TopKFrequentElements347Test {
    @Test
    public void topKFrequent() throws Exception {
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        List<Integer> reuslt = new TopKFrequentElements347().topKFrequent(nums, 2);
        System.out.println(reuslt);
    }

}