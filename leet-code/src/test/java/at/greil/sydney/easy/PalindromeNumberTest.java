package at.greil.sydney.easy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    PalindromeNumber palindromeNumber;

    @BeforeEach
    public void init() {
        palindromeNumber = new PalindromeNumber();
    }

    @Test
    void isPalindromeExample1() {
        boolean isPalindrome = palindromeNumber.isPalindrome(121);
        assertTrue(isPalindrome);
    }

    @Test
    void isPalindromeExample2() {
        boolean isPalindrome = palindromeNumber.isPalindrome(-121);
        assertFalse(isPalindrome);
    }

    @Test
    void isPalindromeExample3() {
        boolean isPalindrome = palindromeNumber.isPalindrome(10);
        assertFalse(isPalindrome);
    }

    @Test
    void isPalindromeExample4() {
        boolean isPalindrome = palindromeNumber.isPalindrome(77111177);
        assertTrue(isPalindrome);
    }
}