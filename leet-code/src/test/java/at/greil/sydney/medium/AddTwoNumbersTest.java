package at.greil.sydney.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {

    AddTwoNumbers addTwoNumbers;
    
    @BeforeEach
    void setUp() {
        addTwoNumbers = new AddTwoNumbers();
    }

    @Test
    void addTwoNumbers() {
        ListNode l1 = new ListNode(2,new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5,new ListNode(6, new ListNode(4)));
        ListNode excpected = new ListNode(7,new ListNode(0, new ListNode(8)));

        ListNode actual = addTwoNumbers.addTwoNumbers(l1, l2);
        assertEquals(excpected.val, actual.val);
        assertEquals(excpected.next.val, actual.next.val);
        assertEquals(excpected.next.next.val, actual.next.next.val);
    }
}