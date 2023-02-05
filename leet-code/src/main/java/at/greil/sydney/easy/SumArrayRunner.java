package at.greil.sydney.easy;

/**
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 * Return the running sum of nums.
 * Example 1:
 *
 * Input: nums = [1,2,3,4]
 * Output: [1,3,6,10]
 * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 *
 * https://leetcode.com/problems/running-sum-of-1d-array/?envType=study-plan&id=level-1
 */
public class SumArrayRunner {

    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int temp = 0;
        
        for (int i = 0; i < nums.length; i++) {
            temp += nums[i];
            result[i] = temp;
        }
        return result;
    }
}
