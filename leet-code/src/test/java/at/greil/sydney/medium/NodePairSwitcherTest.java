package at.greil.sydney.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodePairSwitcherTest {

    NodePairSwitcher nodePairSwitcher;

    @BeforeEach
    void setUp() {
        nodePairSwitcher = new NodePairSwitcher();
    }

    @Test
    void swapPairs() {
        ListNode l1 = new ListNode(1,new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode expected = new ListNode(2,new ListNode(1, new ListNode(4, new ListNode(3))));
        ListNode actual = nodePairSwitcher.swapPairs(l1);
        assertEquals(expected.val, actual.val);
    }
}