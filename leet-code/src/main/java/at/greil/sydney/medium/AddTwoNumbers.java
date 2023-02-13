package at.greil.sydney.medium;

import java.math.BigDecimal;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var value1 = getValue(l1);
        var value2 = getValue(l2);
        var res = String.valueOf(value1.add(value2));
        var sb = new StringBuilder(res);
        res = sb.reverse().toString();

        //trick also skip the first one
        var head = new ListNode();
        var cur = head;

        //iterating throught the result
        for (int i = 0; i < res.length(); i++) {
            cur.next = new ListNode(res.charAt(i) - '0');
            cur = cur.next;
        }
        return head.next;
    }
    private BigDecimal getValue(ListNode listNode) {
        var res = "";
        while (listNode != null) {
            res = "" + listNode.val + res;
            listNode = listNode.next;
        }
        return new BigDecimal(res);
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {
    }
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}