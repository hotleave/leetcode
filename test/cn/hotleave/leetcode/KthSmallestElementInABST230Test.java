package cn.hotleave.leetcode;

import org.junit.Test;
import cn.hotleave.leetcode.KthSmallestElementInABST230.TreeNode;

import static org.junit.Assert.*;

/**
 * @author hotleave
 */
public class KthSmallestElementInABST230Test {
    @Test
    public void kthSmallest() throws Exception {
        KthSmallestElementInABST230 solution = new KthSmallestElementInABST230();
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(4);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(1);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(18);
        root.right.left.left = new TreeNode(12);
        root.right.left.right = new TreeNode(14);
        root.right.right.left = new TreeNode(17);
        root.right.right.right = new TreeNode(20);
        root.right.right.left.left = new TreeNode(16);
        root.right.right.right.left = new TreeNode(19);
        root.right.right.right.right = new TreeNode(24);


        assertEquals(12, solution.kthSmallest(root, 6));
    }

}