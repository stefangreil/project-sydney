package at.greil.sydney.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtoiStringIntegerConverterTest {

    AtoiStringIntegerConverter atoiStringIntegerConverter;

    @BeforeEach
    void setUp() {
        atoiStringIntegerConverter = new AtoiStringIntegerConverter();
    }

    @Test
    void myAtoiExample1() {
        int actual = atoiStringIntegerConverter.myAtoi("42");
        assertEquals(42, actual);
    }

    @Test
    void myAtoiExample2() {
        int actual = atoiStringIntegerConverter.myAtoi("   -42");
        assertEquals(-42, actual);
    }

    @Test
    void myAtoiExample3() {
        int actual = atoiStringIntegerConverter.myAtoi("4193 with words");
        assertEquals(4193, actual);
    }

    @Test
    void myAtoiExample4() {
        int actual = atoiStringIntegerConverter.myAtoi("words and 987");
        assertEquals(0, actual);
    }

    @Test
    void myAtoiExample5() {
        int actual = atoiStringIntegerConverter.myAtoi("3.14159");
        assertEquals(3, actual);
    }

    @Test
    void myAtoiExample6() {
        int actual = atoiStringIntegerConverter.myAtoi("+-12");
        assertEquals(0, actual);
    }

    @Test
    void myAtoiExample7() {
        int actual = atoiStringIntegerConverter.myAtoi("+");
        assertEquals(0, actual);
    }

}