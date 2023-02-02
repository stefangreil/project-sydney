package at.greil.sydney.medium;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReverseListAdditionnerTest {

    ReverseListAdditionner reverseListAdditionner;

    @BeforeEach
    void init() {
        reverseListAdditionner = new ReverseListAdditionner();
    }

    @Test
    void addTwoNumbersExample1() {
        var l1 = new LinkedList<>(Arrays.asList(2, 4, 3));
        var l2 = new LinkedList<>(Arrays.asList(5, 6, 4));
        var actual = reverseListAdditionner.addTwoNumbers(l1, l2);
        var expected = new LinkedList<>(Arrays.asList(7, 0, 8));
        assertEquals(expected, actual);
    }

    @Test
    void addTwoNumbersExample2() {
        var l1 = new LinkedList<>(List.of(0));
        var l2 = new LinkedList<>(List.of(0));
        var actual = reverseListAdditionner.addTwoNumbers(l1, l2);
        var expected = new LinkedList<>(List.of(0));
        assertEquals(expected, actual);
    }

    @Test
    void addTwoNumbersExample3() {
        var l1 = new LinkedList<>(Arrays.asList(9,9,9,9,9,9,9));
        var l2 = new LinkedList<>(Arrays.asList(9,9,9,9));
        var actual = reverseListAdditionner.addTwoNumbers(l1, l2);
        var expected = new LinkedList<>(Arrays.asList(8,9,9,9,0,0,0,1));
        assertEquals(expected, actual);
    }
}