package com.github.rodiond26.multitrack.p03_prefix_sum;

// 11:53 - 11:56 = 3 min
class Solution1480 {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];
        }
        return result;
    }
}
