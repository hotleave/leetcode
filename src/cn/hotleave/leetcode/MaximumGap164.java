package cn.hotleave.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/maximum-gap/
 *
 * @author hotleave
 */
public class MaximumGap164 {
    /**
     * Given an unsorted array, find the maximum difference between the successive elements in its sorted form.
     *
     * @param nums
     * @return
     */
    public int maximumGap(int[] nums) {
        int length = nums.length;
        if (length < 2) {
            return 0;
        }

        Arrays.sort(nums);

        int gap = 0;
        int tmp;
        for (int i = nums.length - 1; i > 0; i--) {
            tmp = nums[i] - nums[i - 1];

            if (tmp > gap) {
                gap = tmp;
            }
        }

        return gap;
    }
}
