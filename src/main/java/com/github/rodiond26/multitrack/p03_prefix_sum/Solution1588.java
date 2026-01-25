package com.github.rodiond26.multitrack.p03_prefix_sum;

// 12:07 - 12:34 = 27 min

class Solution1588 {
    public int sumOddLengthSubarrays(int[] arr) {
        int[] nums = new int[arr.length];
        nums[0] = arr[0];

        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + arr[i];
        }

        int sum = 0;

        for (int len = 1; len <= arr.length; len += 2) {
            for (int i = 0; i <= arr.length - len; i++) {
                sum += sum(nums, i, i + len - 1);
            }
        }
        return sum;
    }

    private int sum(int[] arr, int left, int right) {
        if (left == 0) {
            return arr[right];
        }
        return arr[right] - arr[left - 1];
    }
}
