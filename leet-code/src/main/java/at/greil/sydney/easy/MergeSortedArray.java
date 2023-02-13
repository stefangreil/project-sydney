package at.greil.sydney.easy;

import java.util.Arrays;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int counter = m;
        for (int i = 0; i < n; i++) {
            nums1[counter] = nums2[i];
            counter++;
        }
        Arrays.sort(nums1);
        System.out.println("nums1 = " + Arrays.toString(nums1) + ", m = " + m + ", nums2 = " + Arrays.toString(nums2) + ", n = " + n);
    }
}
