package com.github.rodiond26.multitrack.p05_prefix_sum;

class Solution724 {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        int sumLeft = 0;

        for (int i = 0; i < nums.length; i++) {
            if (sumLeft * 2 == total - nums[i]) {
                return i;
            }
            sumLeft += nums[i];
        }
        return -1;
    }
}
