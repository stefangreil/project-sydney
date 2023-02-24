package at.greil.sydney.medium;

public class NodePairSwitcher {

    public ListNode swapPairs(ListNode head) {

        if(head == null || head.next == null) {
            return head;
        }

        int count = 0;

        ListNode work = head;
        while(work.next != null) {
            if(count % 2 == 0) {
                int temp = work.val;
                work.val = work.next.val;
                work.next.val = temp;

            }
            work = work.next;
            count++;
        }


        return head;
    }
}
