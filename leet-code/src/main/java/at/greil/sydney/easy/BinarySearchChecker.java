package at.greil.sydney.easy;

public class BinarySearchChecker {

    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid;
            } else {
                right = mid;
            }
            if ((right - left) == 1) {

                if (nums[left] == target) {
                    return left;
                }
                break;
            }
        }

        return -1;
    }
}
