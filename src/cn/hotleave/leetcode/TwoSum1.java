package cn.hotleave.leetcode;

/**
 * Created by hotleave on 2016/10/9.
 */
public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        int start = 0;
        int length = nums.length;
        int diff;
        int i;

        while (start < length) {
            diff = target - nums[start];

            for (i = start + 1; i < length; i++) {
                if (nums[i] == diff) {
                    return new int[] {start, i};
                }
            }

            // check next
            start++;
        }

        return new int[0];
    }
}
