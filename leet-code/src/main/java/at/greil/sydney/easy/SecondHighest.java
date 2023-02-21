package at.greil.sydney.easy;

import java.util.Arrays;

public class SecondHighest {
    public int secondHighest(int[] nums) {
        Arrays.sort(nums);
        return (nums.length >= 2) ? nums[nums.length - 2] : -1;
    }
}
