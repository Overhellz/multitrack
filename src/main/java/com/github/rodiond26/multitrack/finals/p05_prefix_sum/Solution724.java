package com.github.rodiond26.multitrack.finals.p05_prefix_sum;

class Solution724 {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }

        int leftSum = 0;

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            if (2 * leftSum == total - current) {
                return i;
            }
            leftSum += current;
        }
        return -1;
    }
}
