package se.soud.leetcode;

import java.util.Arrays;

public class FindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums1Length = nums1.length;
        int nums2Length = nums2.length;
        int mergedNumsLength = nums1Length + nums2Length;
        int[] mergedNums = new int[mergedNumsLength];
        System.arraycopy(nums1, 0, mergedNums, 0, nums1Length);
        System.arraycopy(nums2, 0, mergedNums, nums1Length, nums2Length);

        Arrays.sort(mergedNums);

        if (mergedNums.length == 1) {
            return (double) mergedNums[0];
        }

        int halfPoint = mergedNums.length / 2;

        if ((mergedNums.length % 2) == 0) {
            return (double) (mergedNums[(int) halfPoint] + mergedNums[((int) halfPoint) - 1]) / 2;
        } else {
            return (double) mergedNums[(int) Math.ceil(halfPoint)];
        }
    }
}
