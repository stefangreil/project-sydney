package at.greil.sydney.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeEndListRemoverTest {

    NodeEndListRemover nodeEndListRemover;

    @BeforeEach
    void setUp() {
        nodeEndListRemover = new NodeEndListRemover();
    }

    @Test
    void removeNthFromEnd() {

        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(5))));
        ListNode actual = nodeEndListRemover.removeNthFromEnd(l1, 2);
        assertEquals(expected.val, actual.val);

    }

    @Test
    void removeNthFromEndExample2() {

        ListNode l1 = new ListNode(1);
        ListNode actual = nodeEndListRemover.removeNthFromEnd(l1, 1);
        assertEquals(null, actual);

    }

    @Test
    void removeNthFromEndExample3() {

        ListNode l1 = new ListNode(1, new ListNode(2));
        ListNode expected = new ListNode(1);
        ListNode actual = nodeEndListRemover.removeNthFromEnd(l1, 1);
        assertEquals(expected.val, actual.val);

    }


    @Test
    void removeNthFromEndExample4() {

        ListNode l1 = new ListNode(1, new ListNode(2));
        ListNode expected = new ListNode(2);
        ListNode actual = nodeEndListRemover.removeNthFromEnd(l1, 2);
        assertEquals(expected.val, actual.val);

    }
}