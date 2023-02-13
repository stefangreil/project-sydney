package at.greil.sydney.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstBadVersionCheckerTest {

    FirstBadVersionChecker firstBadVersionChecker;

    @BeforeEach
    void setUp() {
        firstBadVersionChecker = new FirstBadVersionChecker();
    }

    @Test
    void firstBadVersionExample1() {
        firstBadVersionChecker.setVersion(4);
        int actual = firstBadVersionChecker.firstBadVersion(5);
        assertEquals(4, actual);
    }

    @Test
    void firstBadVersionExample2() {
        firstBadVersionChecker.setVersion(1);
        int actual = firstBadVersionChecker.firstBadVersion(1);
        assertEquals(1, actual);
    }
}