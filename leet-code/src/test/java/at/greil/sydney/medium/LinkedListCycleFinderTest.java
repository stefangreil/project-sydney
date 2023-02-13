package at.greil.sydney.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static at.greil.sydney.medium.ListNode2.createList;

class LinkedListCycleFinderTest {

    LinkedListCycleFinder linkedListCycleFinder;

    @BeforeEach
    void init () {
        linkedListCycleFinder = new LinkedListCycleFinder();
    }
    @Test
    void detectCycleExample() {
        ListNode2 l1 = createList(3,2,0,-4);
        ListNode2 listNode2 = linkedListCycleFinder.detectCycle(l1);
        System.out.println(listNode2);
    }

    @Test
    void detectCycleExample2() {
        ListNode2 l1 = createList(1,2);
        ListNode2 listNode2 = linkedListCycleFinder.detectCycle(l1);
        System.out.println(listNode2);
    }

    @Test
    void detectCycleExample3() {
        ListNode2 l1 = createList(1);
        ListNode2 listNode2 = linkedListCycleFinder.detectCycle(l1);
        System.out.println(listNode2);
    }
}