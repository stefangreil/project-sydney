package at.greil.sydney.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstStringOccuranceFinderTest {

    FirstStringOccuranceFinder firstStringOccuranceFinder;
    @BeforeEach
    void init() {
        firstStringOccuranceFinder = new FirstStringOccuranceFinder();
    }
    @Test
    void strStr1() {
        assertEquals(0, firstStringOccuranceFinder.strStr("sadbutsad", "sad"));
    }

    @Test
    void strStr2() {
        assertEquals(-1, firstStringOccuranceFinder.strStr("leetcode", "leeto"));
    }

    @Test
    void strStr3() {
        assertEquals(2, firstStringOccuranceFinder.strStr("karotte", "rot"));
    }
}