package at.greil.sydney.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortedListsMergerTest {

    SortedListsMerger sortedListsMerger;

    @BeforeEach
    void init() {
        sortedListsMerger = new SortedListsMerger();
    }

    @Test
    void mergeTwoLists() {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode expected = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));

        ListNode actual = sortedListsMerger.mergeTwoLists(l1, l2);

        assertNotNull(actual);
    }
}