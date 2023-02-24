package at.greil.sydney.hard;

import at.greil.sydney.util.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortedListMergerTest {

    SortedListMerger sortedListMerger;

    @BeforeEach
    void setUp() {
        sortedListMerger = new SortedListMerger();
    }

    @Test
    void mergeKLists() {
        ListNode l1 = new ListNode(1,new ListNode(4, new ListNode(5)));
        ListNode l2 = new ListNode(1,new ListNode(3, new ListNode(4)));
        ListNode l3 = new ListNode(2,new ListNode(6));
        ListNode[] listNodes = {l1, l2, l3};

        ListNode actual = sortedListMerger.mergeKLists(listNodes);
        assertEquals(1, actual.val);
    }

    @Test
    void mergeKListsExample2() {
        ListNode l2 = new ListNode(1);
        ListNode[] listNodes = {null, l2};

        ListNode actual = sortedListMerger.mergeKLists(listNodes);
        assertEquals(1, actual.val);
    }
}