package at.greil.sydney.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommonPrefixTest {

    CommonPrefix commonPrefix;

    @BeforeEach
    public void init() {
        commonPrefix = new CommonPrefix();
    }

    @Test
    void longestCommonPrefixExample1() {
        var input = new String[]{"flower", "flow", "flight"};
        String actual = commonPrefix.longestCommonPrefix(input);
        assertEquals("fl", actual);
    }

    @Test
    void longestCommonPrefixExample2() {
        var input = new String[]{"dog","racecar","car"};
        String actual = commonPrefix.longestCommonPrefix(input);
        assertEquals("", actual);
    }

    @Test
    void longestCommonPrefixExample3() {
        var input = new String[]{"a"};
        String actual = commonPrefix.longestCommonPrefix(input);
        assertEquals("a", actual);
    }
}