package at.greil.sydney.medium;

public class NodeEndListRemover {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        n--;
        ListNode current = head;

        if (current.next == null && n == 1) {
            return null;
        }

        int count = 0;

        while (current.next != null) {
            current = current.next;
            count++;
        }
        current = head;
        int count2 = 0;
        while (current.next != null) {

            if (count2 == (count - n)) {
                if (current.next.next != null) {
                    current.next.val = current.next.next.val;
                    current.next = current.next.next;
                } else {
                    current.val = current.next.val;
                    current.next = null;
                }
            } else {
                current = current.next;
            }
            count2++;
        }

        return head;
    }
}
