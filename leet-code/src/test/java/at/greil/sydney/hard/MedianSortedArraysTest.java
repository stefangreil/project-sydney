package at.greil.sydney.hard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedianSortedArraysTest {

    MedianSortedArrays medianSortedArrays;
    @BeforeEach
    void setUp() {
        medianSortedArrays = new MedianSortedArrays();
    }

    @Test
    void findMedianSortedArrays() {
        int[] num1 = {1,3};
        int[] num2 = {2};
        double actual = medianSortedArrays.findMedianSortedArrays(num1, num2);
        assertEquals(2.0, actual);
    }

    @Test
    void findMedianSortedArrays2() {
        int[] num1 = {1,2};
        int[] num2 = {3,4};
        double actual = medianSortedArrays.findMedianSortedArrays(num1, num2);
        assertEquals(2.5, actual);
    }
}