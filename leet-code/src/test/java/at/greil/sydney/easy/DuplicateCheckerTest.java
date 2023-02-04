package at.greil.sydney.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DuplicateCheckerTest {
    DuplicateChecker duplicateChecker;

    @BeforeEach
    public void init() {
        duplicateChecker = new DuplicateChecker();
    }

    @Test
    void removeDuplicatesExample1() {
        int[] nums = {1,1,2}; // Input array
        int[] expectedNums = {1,2,0}; // The expected answer with correct length

        duplicateChecker = new DuplicateChecker();
        int k = duplicateChecker.removeDuplicates(nums);

        assert k == 2;
        assertNums(nums, expectedNums, k);
    }

    @Test
    void removeDuplicatesExample2() {
        int[] nums = {0,0,1,1,1,2,2,3,3,4}; // Input array
        int[] expectedNums = {0,1,2,3,4,0,0,0,0,0}; // The expected answer with correct length

        duplicateChecker = new DuplicateChecker();
        int k = duplicateChecker.removeDuplicates(nums);

        assert k == 5;
        assertNums(nums, expectedNums, k);
    }

    private static void assertNums(int[] nums, int[] expectedNums, int k) {
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}