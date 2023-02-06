package at.greil.sydney.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringCheckerTest {

    LongestSubstringChecker longestSubstringChecker;

    @BeforeEach
    void init() {
        longestSubstringChecker = new LongestSubstringChecker();
    }

    @Test
    void lengthOfLongestSubstring() {
        int actual = longestSubstringChecker.lengthOfLongestSubstring("abcabcbb");
        assertEquals(3, actual);
    }

    @Test
    void lengthOfLongestSubstringExample2() {
        int actual = longestSubstringChecker.lengthOfLongestSubstring("bbbb");
        assertEquals(1, actual);
    }

    @Test
    void lengthOfLongestSubstringExample3() {
        int actual = longestSubstringChecker.lengthOfLongestSubstring("pwwkew");
        assertEquals(3, actual);
    }

    @Test
    void lengthOfLongestSubstringExample4() {
        int actual = longestSubstringChecker.lengthOfLongestSubstring("aab");
        assertEquals(2, actual);
    }

    @Test
    void lengthOfLongestSubstringExample5() {
        int actual = longestSubstringChecker.lengthOfLongestSubstring("dvdf");
        assertEquals(3, actual);
    }

    @Test
    void lengthOfLongestSubstringExample6() {
        int actual = longestSubstringChecker.lengthOfLongestSubstring("hkcpmprxxxqw");
        assertEquals(5, actual);
    }
}