package at.greil.sydney.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LastWordLengthCheckerTest {

    LastWordLengthChecker lastWordLengthChecker;

    @BeforeEach
    void init() {
        lastWordLengthChecker = new LastWordLengthChecker();
    }

    @Test
    void lengthOfLastWord() {
        int actual = lastWordLengthChecker.lengthOfLastWord("   fly me   to   the moon  ");
        assertEquals(4, actual);
    }

    @Test
    void lengthOfLastWordExample2() {
        int actual = lastWordLengthChecker.lengthOfLastWord("a");
        assertEquals(1, actual);
    }

    @Test
    void lengthOfLastWordExample3() {
        int actual = lastWordLengthChecker.lengthOfLastWord("day");
        assertEquals(3, actual);
    }


    @Test
    void lengthOfLastWordExample4() {
        int actual = lastWordLengthChecker.lengthOfLastWord(" a");
        assertEquals(1, actual);
    }
}