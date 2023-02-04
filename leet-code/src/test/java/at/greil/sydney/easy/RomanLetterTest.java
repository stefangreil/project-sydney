package at.greil.sydney.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanLetterTest {

    RomanLetter romanLetter;

    @BeforeEach
    public void init() {
        romanLetter = new RomanLetter();
    }

    @Test
    void romanToIntExample1() {
        int romanValue = romanLetter.romanToInt("III");
        assertEquals(3, romanValue);
    }

    @Test
    void romanToIntExample2() {
        int romanValue = romanLetter.romanToInt("LVIII");
        assertEquals(58, romanValue);
    }

    @Test
    void romanToIntExample3() {
        int romanValue = romanLetter.romanToInt("MCMXCIV");
        assertEquals(1994, romanValue);
    }
}