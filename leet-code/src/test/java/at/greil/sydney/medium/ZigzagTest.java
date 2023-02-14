package at.greil.sydney.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZigzagTest {

    Zigzag zigzag;

    @BeforeEach
    void setUp() {
        zigzag = new Zigzag();
    }

    @Test
    void convert() {
        String s = "PAYPALISHIRING";
        String actual = zigzag.convert(s, 3);
        assertEquals("PAHNAPLSIIGYIR", actual);
    }

    @Test
    void convert2() {
        String s = "PAYPALISHIRING";
        String actual = zigzag.convert(s, 4);
        assertEquals("PINALSIGYAHRPI", actual);
    }

    @Test
    void convert3() {
        String s = "ABC";
        String actual = zigzag.convert(s, 2);
        assertEquals("ACB", actual);
    }
}