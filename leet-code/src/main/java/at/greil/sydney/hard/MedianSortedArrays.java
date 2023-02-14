package at.greil.sydney.hard;

import java.util.Arrays;

public class MedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] resArr = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            resArr[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            resArr[nums1.length + i] = nums2[i];
        }
        Arrays.sort(resArr);
        int index = (resArr.length - 1) / 2;
        if (resArr.length % 2 == 0) {
            return ((resArr[index] + resArr[index + 1]) / 2.0);
        } else {
            return resArr[index];
        }
    }

}
