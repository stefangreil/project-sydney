package at.greil.sydney.medium;

import java.util.Objects;

public class LinkedListCycleFinder {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Search it using loop
        // slow and fast pointers
        while(fast!=null && fast.next!=null){
            // Move slow and fast 1
            // and 2 steps ahead
            // respectively.
            slow = slow.next;
            fast = fast.next.next;
            // slow == fast means, circle exist
            if(slow == fast){
                ListNode slow1 = head;
                // If loop exists. Start slow1 from
                // head and fast from meeting point.
                while(slow != slow1){
                    slow = slow.next;
                    slow1 = slow1.next;
                }
                return slow;
            }
        }
        return null;
    }


}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }

    public static ListNode createList(int... values) {
        ListNode head = new ListNode(values[0]);
        ListNode prev = head;
        for (int i = 1; i < values.length; i++) {
            prev.next = new ListNode(values[i]);
            prev = prev.next;
        }
        return head;
    }

    @Override
    public String toString() {

        return val + "->" + next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return val == listNode.val &&
                Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }
}