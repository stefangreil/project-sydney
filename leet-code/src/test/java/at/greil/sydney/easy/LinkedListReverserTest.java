package at.greil.sydney.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertLinesMatch;

class LinkedListReverserTest {

    LinkedListReverser linkedListReverser;

    @BeforeEach
    void init() {
        linkedListReverser = new LinkedListReverser();
    }

    @Test
    void mergeTwoLists() {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode expected = new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1)))));
        ListNode actual = linkedListReverser.reverseList(l1);
        System.out.println(expected + " " +  actual);
    }
}