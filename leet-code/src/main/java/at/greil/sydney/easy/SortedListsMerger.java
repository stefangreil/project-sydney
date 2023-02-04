package at.greil.sydney.easy;

public class SortedListsMerger {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode mergedListNode = new ListNode();
        ListNode result = mergedListNode;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                mergedListNode.next = list1;
                list1 = list1.next;

            } else {

                mergedListNode.next = list2;
                list2 = list2.next;
            }

            mergedListNode = mergedListNode.next;

        }

        if(list1!=null){
            mergedListNode.next=list1;
        }else{
            mergedListNode.next=list2;
        }

        return result.next;
    }
}

/**
 * Definition for singly-linked list.
 */
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
