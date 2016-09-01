package cn.hotleave.leetcode;

/**
 * https://leetcode.com/problems/wiggle-subsequence/
 *
 * @author hotleave
 */
public class WiggleSubsequence376 {

    /**
     * A sequence of numbers is called a wiggle sequence if the differences between successive numbers strictly alternate between positive and negative.
     * The first difference (if one exists) may be either positive or negative. A sequence with fewer than two elements is trivially a wiggle sequence.
     *
     * @param nums
     * @return
     */
    public int wiggleMaxLength(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }

        int size = 1;
        int diff;
        int lastDiff = 0;

        for (int i = 0, length = nums.length - 1; i < length; i++) {
            diff = nums[i] - nums[i + 1];
            // when the two number is not the same, and the difference and last difference's sign is not the same, add up the size, and record the status
            if (diff != 0 && diff * lastDiff <= 0) {
                size++;
                lastDiff = diff;
            }
        }

        return size;
    }

}
