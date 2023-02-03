package at.greil.sydney.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesCheckerTest {

    ValidParenthesesChecker validParenthesesChecker;

    @BeforeEach
    void init() {
        validParenthesesChecker = new ValidParenthesesChecker();
    }

    @Test
    void isValidExymple1() {
        assertTrue(validParenthesesChecker.isValid("()"));
    }

    @Test
    void isValidExymple2() {
        assertTrue(validParenthesesChecker.isValid("()[]{}"));
    }

    @Test
    void isValidExymple3() {
        assertFalse(validParenthesesChecker.isValid("(]"));
    }

    @Test
    void isValidExymple4() {
        assertFalse(validParenthesesChecker.isValid("([)]"));
    }

    @Test
    void isValidExymple5() {
        assertFalse(validParenthesesChecker.isValid("]"));
    }

    @Test
    void isValidExymple6() {
        assertFalse(validParenthesesChecker.isValid("){"));
    }

    @Test
    void isValidExymple7() {
        assertFalse(validParenthesesChecker.isValid("({{{{}}}))"));
    }

}