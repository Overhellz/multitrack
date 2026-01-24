package com.github.rodiond26.multitrack.p02_sliding_window;

class Solution643 {
    public double findMaxAverage(int[] nums, int k) {
        int currentSum = 0;

        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }

        int maxSum = currentSum;

        for (int i = 1; i <= nums.length - k; i++) {
            currentSum = currentSum - nums[i - 1] + nums[i + k - 1];
            maxSum = Math.max(maxSum, currentSum);
        }

        return (double) maxSum / k;
    }
}
