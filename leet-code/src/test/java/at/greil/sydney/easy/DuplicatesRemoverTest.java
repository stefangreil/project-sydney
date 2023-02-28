package at.greil.sydney.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicatesRemoverTest {

    DuplicatesRemover duplicatesRemover;

    @BeforeEach
    void setUp() {
        duplicatesRemover = new DuplicatesRemover();
    }

    @Test
    void removeDuplicates() {
        int[] nums = {1,1,2};
        int[] excpected = {1,2,0};
        int actualLength = duplicatesRemover.removeDuplicates(nums);
        assertEquals(2, actualLength);
        assertArrayEquals(excpected, nums);
    }

    @Test
    void removeDuplicates2() {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] excpected = {0,1,2,3,4};
        int actualLength = duplicatesRemover.removeDuplicates(nums);
        assertEquals(2, actualLength);
        assertArrayEquals(excpected, nums);
    }
}