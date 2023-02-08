package at.greil.sydney.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static at.greil.sydney.medium.ListNode.createList;
import static org.junit.jupiter.api.Assertions.*;

class LinkedListCycleFinderTest {

    LinkedListCycleFinder linkedListCycleFinder;

    @BeforeEach
    void init () {
        linkedListCycleFinder = new LinkedListCycleFinder();
    }
    @Test
    void detectCycleExample() {
        ListNode l1 = createList(3,2,0,-4);
        ListNode listNode = linkedListCycleFinder.detectCycle(l1);
        System.out.println(listNode);
    }

    @Test
    void detectCycleExample2() {
        ListNode l1 = createList(1,2);
        ListNode listNode = linkedListCycleFinder.detectCycle(l1);
        System.out.println(listNode);
    }

    @Test
    void detectCycleExample3() {
        ListNode l1 = createList(1);
        ListNode listNode = linkedListCycleFinder.detectCycle(l1);
        System.out.println(listNode);
    }
}