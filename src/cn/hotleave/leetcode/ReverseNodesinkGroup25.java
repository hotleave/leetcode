package cn.hotleave.leetcode;

/**
 * Created by hotleave on 16-12-28.
 */
public class ReverseNodesinkGroup25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 1) {
            return head;
        }

        // a stack
        ListNode[] group = new ListNode[k];
        ListNode newHead = head;
        ListNode current = null;
        int index = 0;
        while (head != null) {
            group[index++] = head;
            head = head.next;

            if (index == k) {
                if (current != null) {
                    current.next = group[k - 1];
                } else {
                    newHead = group[k - 1];
                }

                // pop stack
                for (int i = k - 1; i >= 0; i--) {
                    current = group[i];
                    current.next = i > 0 ? group[i - 1] : head;
                }

                // reset the index
                index = 0;
            }
        }

        return newHead;
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int x) {
        val = x;
    }
}
