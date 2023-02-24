package at.greil.sydney.hard;

import at.greil.sydney.util.ListNode;

import javax.swing.text.Utilities;
import java.util.*;

public class SortedListMerger {

    public ListNode mergeKLists(ListNode[] lists) {

        if (lists.length == 0) {
            return null;
        }
        if (lists.length == 1) {
            return lists[0];
        }
        List<Integer> numbers = new ArrayList<>();
        for (ListNode list : lists) {
            if (list != null) {
                ListNode current = list;
                if (current.next == null) {
                    numbers.add(current.val);
                }
                while (current.next != null) {
                    numbers.add(current.val);
                    current = current.next;
                    if (current.next == null) {
                        numbers.add(current.val);
                    }
                }
            }
        }

        Collections.sort(numbers);
        ListNode result = null;
        ListNode current = null;
        for (Integer number : numbers) {
            ListNode tempNode = new ListNode(number);
            if (result == null) {
                result = new ListNode(tempNode.val);
                current = result;
            } else {
                current.next = new ListNode(tempNode.val);
                current = current.next;
            }
        }

        return result;
    }
}
