package at.greil.sydney.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementCheckerTest {

    MajorityElementChecker majorityElementChecker;

    @BeforeEach
    void init() {
        majorityElementChecker = new MajorityElementChecker();
    }
    @Test
    void majorityElement() {
        int[] nums = {2,2,1,1,1,2,2};
        int actual = majorityElementChecker.majorityElement(nums);
        assertEquals(2, actual);
    }

    @Test
    void majorityElement2() {
        int[] nums = {3,2,3};
        int actual = majorityElementChecker.majorityElement(nums);
        assertEquals(3, actual);
    }

    @Test
    void majorityElement3() {
        int[] nums = {1};
        int actual = majorityElementChecker.majorityElement(nums);
        assertEquals(1, actual);
    }

    @Test
    void majorityElement4() {
        int[] nums = {6,5,5};
        int actual = majorityElementChecker.majorityElement(nums);
        assertEquals(5, actual);
    }

    @Test
    void majorityElement5() {
        int[] nums = {8,8,7,7,7,9,9};
        int actual = majorityElementChecker.majorityElement(nums);
        assertEquals(7, actual);
    }

}