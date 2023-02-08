package at.greil.sydney.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubsequenceCheckerTest {

    SubsequenceChecker subsequenceChecker;

    @BeforeEach
    void init() {
        subsequenceChecker = new SubsequenceChecker();
    }
    @Test
    void isSubsequence() {
        assertTrue(subsequenceChecker.isSubsequence("abc","ahbgdc"));
    }

    @Test
    void isSubsequenceExample2() {
        assertFalse(subsequenceChecker.isSubsequence("axc","ahbgdc"));
    }

    @Test
    void isSubsequenceExample3() {
        assertFalse(subsequenceChecker.isSubsequence("axc","ahbgdc"));
    }

    @Test
    void isSubsequenceExample4() {
        assertFalse(subsequenceChecker.isSubsequence("aaaaaa","bbaaaa"));
    }

    @Test
    void isSubsequenceExample5() {
        assertFalse(subsequenceChecker.isSubsequence("bb","ahbgdc"));
    }

    @Test
    void isSubsequenceExample6() {
        assertTrue(subsequenceChecker.isSubsequence("b","abc"));
    }
}