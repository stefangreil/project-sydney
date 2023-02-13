package at.greil.sydney.medium;

import java.util.Objects;

public class LinkedListCycleFinder {
    public ListNode2 detectCycle(ListNode2 head) {
        ListNode2 slow = head;
        ListNode2 fast = head;

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
                ListNode2 slow1 = head;
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

class ListNode2 {
    int val;
    ListNode2 next;

    ListNode2(int x) {
        val = x;
        next = null;
    }

    public static ListNode2 createList(int... values) {
        ListNode2 head = new ListNode2(values[0]);
        ListNode2 prev = head;
        for (int i = 1; i < values.length; i++) {
            prev.next = new ListNode2(values[i]);
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
        ListNode2 listNode2 = (ListNode2) o;
        return val == listNode2.val &&
                Objects.equals(next, listNode2.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }
}