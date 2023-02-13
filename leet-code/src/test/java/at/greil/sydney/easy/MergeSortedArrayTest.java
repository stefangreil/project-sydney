package at.greil.sydney.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {

    MergeSortedArray mergeSortedArray;

    @BeforeEach
    void setUp() {
        mergeSortedArray = new MergeSortedArray();
    }

    @Test
    void merge() {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        mergeSortedArray.merge(nums1,3,nums2,3);
    }

    @Test
    void merge2() {
        int[] nums1 = {1};
        int[] nums2 = {};

        mergeSortedArray.merge(nums1,1,nums2,0);
    }

    @Test
    void merge3() {
        int[] nums1 = {0};
        int[] nums2 = {1};

        mergeSortedArray.merge(nums1,0,nums2,1);
    }
}