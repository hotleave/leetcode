package cn.hotleave.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hotleave on 16-12-28.
 */
public class ReverseNodesinkGroup25Test {
    @Test
    public void reverseKGroup() throws Exception {
        ReverseNodesinkGroup25 solution = new ReverseNodesinkGroup25();
        ListNode next;

        next = solution.reverseKGroup(getHead(), 6);
        Assert.assertEquals("12345", toLinkString(next));

        next = solution.reverseKGroup(getHead(), 1);
        Assert.assertEquals("12345", toLinkString(next));

        next = solution.reverseKGroup(getHead(), 2);
        Assert.assertEquals("21435", toLinkString(next));

        next = solution.reverseKGroup(getHead(), 3);
        Assert.assertEquals("32145", toLinkString(next));

        next = solution.reverseKGroup(getHead(), 5);
        Assert.assertEquals("54321", toLinkString(next));
    }

    private ListNode getHead() {
        ListNode head = new ListNode(1);
        ListNode next = head;
        for (int i = 2; i < 6; i++) {
            next.next = new ListNode(i);
            next = next.next;
        }

        return head;
    }

    private String toLinkString(ListNode head) {
        StringBuilder result = new StringBuilder();
        while (head != null) {
            result.append(head.val);
            head = head.next;
        }

        return result.toString();
    }
}