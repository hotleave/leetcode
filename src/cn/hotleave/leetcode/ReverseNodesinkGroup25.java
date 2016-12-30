package cn.hotleave.leetcode;

/**
 * Created by hotleave on 16-12-28.
 */
public class ReverseNodesinkGroup25 {
    /**
     * Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.
     * <p>
     * If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.
     * <p>
     * You may not alter the values in the nodes, only nodes itself may be changed.
     * <p>
     * Only constant memory is allowed.
     * <p>
     * For example,
     * Given this linked list: 1->2->3->4->5
     * <p>
     * For k = 2, you should return: 2->1->4->3->5
     * <p>
     * For k = 3, you should return: 3->2->1->4->5
     *
     * @param head
     * @param k
     * @return
     */
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
