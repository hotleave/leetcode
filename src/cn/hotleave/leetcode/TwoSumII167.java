package cn.hotleave.leetcode;

/**
 * Created by hotleave on 2016/10/9.
 */
public class TwoSumII167 {
    public int[] twoSum(int[] numbers, int target) {
        int index1 = 0;
        int index2 = numbers.length - 1;
        int sum;
        while (true) {
            sum = numbers[index1] + numbers[index2];

            if (sum < target) {
                index1++;
            } else if (sum > target) {
                index2--;
            } else {
                return new int[]{++index1, ++index2};
            }
        }
    }
}
