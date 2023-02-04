package at.greil.sydney.easy;

public class DuplicateChecker {

    /**
     * 26. Remove Duplicates from Sorted Array
     *
     * Input: nums = [1,1,2]
     * Output: 2, nums = [1,2,0] ??
     * Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
     * It does not matter what you leave beyond the returned k (hence they are underscores).
     *
     * @param nums given integer array
     * @return return the length of the duplicate "free" given array
     */
    public int removeDuplicates(int[] nums) {
        int actualIndex = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1] != nums[i]) {
                nums[actualIndex] = nums[i];
                actualIndex++;
            }
        }

        return actualIndex;
    }
}
