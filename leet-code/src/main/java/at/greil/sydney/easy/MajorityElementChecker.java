package at.greil.sydney.easy;

public class MajorityElementChecker {
    public int majorityElement(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }

        int res = 0;
        int actualCounter = 0;
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            actualCounter = 0;
            int actual = nums[i];

            if (actual == res) continue;

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    actualCounter++;
                }
            }

            if (actualCounter > counter) {
                counter = actualCounter;
                res = actual;
            }
        }
        return res;
    }
}
