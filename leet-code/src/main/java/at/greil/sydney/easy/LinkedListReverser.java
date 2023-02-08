package at.greil.sydney.easy;

import java.util.ArrayList;

public class LinkedListReverser {

    public ListNode reverseList(ListNode head) {
        ListNode result = new ListNode();
        extracted(head, result);

        return result;
    }

    private static void extracted(ListNode head, ListNode result) {
        if (head.next == null) {
            result.val = head.val;
        } else {
            extracted(head.next, result);
            if (result.next == null) {
                result.next = new ListNode(head.val);
            }
            result = result.next;

        }
    }
}