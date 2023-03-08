package se.soud.leetcode;

/*
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product
 * of all the elements of nums except nums[i]. The product of any prefix or suffix of nums is
 * guaranteed to fit in a 32-bit integer. You must write an algorithm that runs in O(n) time and
 * without using the division operation.
 */

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int product = 1;

            for (int j = 0; j < nums.length; j++) {
                if (j == i) {
                    continue;
                }

                product = product * nums[j];
            }

            answer[i] = product;
        }

        return answer;
    }

    public int[] productExceptSelf2(int[] nums) {
        int len = nums.length;
        int[] answer = new int[len];
        int[] left = new int[len];
        int[] right = new int[len];

        left[0] = 1;
        right[len - 1] = 1;

        for (int i = 1; i < len; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        for (int i = len - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < len; i++) {
            answer[i] = left[i] * right[i];
        }

        return answer;
    }
}
