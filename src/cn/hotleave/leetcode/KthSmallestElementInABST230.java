package cn.hotleave.leetcode;

/**
 * https://leetcode.com/problems/kth-smallest-element-in-a-bst/
 *
 * @author hotleave
 */
public class KthSmallestElementInABST230 {
    int k;
    int value;
    int smallestIndex;

    /**
     * Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.
     *
     * @param root
     * @param k
     * @return
     */
    public int kthSmallest(TreeNode root, int k) {
        this.k = k;

        iterate(root);

        return value;
    }


    private void iterate(TreeNode root) {
        if (root.left != null) {
            iterate(root.left);
        }

        if (++smallestIndex == k) {
            value = root.val;
            return;
        }

        if (root.right != null) {
            iterate(root.right);
        }
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}
