package at.greil.sydney.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchCheckerTest {

    BinarySearchChecker binarySearchChecker;

    @BeforeEach
    void setUp() {
        binarySearchChecker = new BinarySearchChecker();
    }

    @Test
    void searchExample1() {
        int[] input = {-1,0,3,5,9,12};
        int actual = binarySearchChecker.search(input, 9);
        assertEquals(4, actual);
    }

    @Test
    void searchExample2() {
        int[] input = {-1,0,3,5,9,12};
        int actual = binarySearchChecker.search(input, 2);
        assertEquals(-1, actual);
    }

    @Test
    void searchExample3() {
        int[] input = {2,5};
        int actual = binarySearchChecker.search(input, 2);
        assertEquals(0, actual);
    }
}