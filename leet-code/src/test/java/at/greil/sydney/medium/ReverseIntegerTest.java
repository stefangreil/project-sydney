package at.greil.sydney.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {

    ReverseInteger reverseInteger;

    @BeforeEach
    void init() {
        reverseInteger = new ReverseInteger();
    }
    @Test
    void reverseExample1() {
        int actual = reverseInteger.reverse(123);
        assertEquals(321, actual);
    }

    @Test
    void reverseExample2() {
        int actual = reverseInteger.reverse(-123);
        assertEquals(-321, actual);
    }

    @Test
    void reverseExample3() {
        int actual = reverseInteger.reverse(120);
        assertEquals(21, actual);
    }
}