package cn.hotleave.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by hotleave on 16-12-28.
 */
public class CountTofSmallerNumbersAfterSelf315 {
    /**
     * You are given an integer array nums and you have to return a new counts array. The counts array has the property where counts[i] is the number of smaller elements to the right of nums[i].
     * <p>
     * Example:
     * <p>
     * Given nums = [5, 2, 6, 1]
     * <p>
     * To the right of 5 there are 2 smaller elements (2 and 1).
     * To the right of 2 there is only 1 smaller element (1).
     * To the right of 6 there is 1 smaller element (1).
     * To the right of 1 there is 0 smaller element.
     * Return the array [2, 1, 1, 0].
     */
    public List<Integer> countSmaller(int[] nums) {
        if (nums == null || nums.length == 0) {
            return Collections.emptyList();
        }
        int length = nums.length;
        if (length == 1) {
            return Arrays.asList(0);
        }


        Integer[] answer = new Integer[nums.length];
        TreeNode node = null;
        for (int i = length - 1; i >= 0; i--) {
            node = insertNode(node, 0, nums[i], answer, i);
        }

        return Arrays.asList(answer);
    }

    /**
     * insert new node
     *
     * @param node   parent node to be insert to
     * @param preSum the sum of count of smaller number
     * @param value    node value
     * @param answer   the answer we need
     * @param index    current number index, used to write the answer
     * @return the new insert Node
     */
    private TreeNode insertNode(TreeNode node, int preSum, int value, Integer[] answer, int index) {
        if (node == null) {
            node = new TreeNode(value, 0);
            answer[index] = preSum;
        } else if (node.value == value) {
            node.duplicate++;
            answer[index] = node.smallSize + preSum;
        } else if (node.value > value) {
            // add to the left tree, so increase the smallSize
            node.smallSize++;
            node.left = insertNode(node.left, preSum, value, answer, index);
        } else {
            node.right = insertNode(node.right, preSum + node.smallSize + (node.value < value ? 1 : 0), value, answer, index);
        }

        return node;
    }

    class TreeNode {
        TreeNode left;
        TreeNode right;
        int value;
        int smallSize;
        int duplicate;

        TreeNode(int value, int smallSize) {
            this.value = value;
            this.smallSize = smallSize;
        }
    }
}
