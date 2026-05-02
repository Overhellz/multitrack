package com.github.rodiond26.multitrack.finals.p04_sliding_window;

class Solution209 {
    public int minSubArrayLen(int target, int[] nums) {
        int pointer = 0;

        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            while (sum >= target) {
                minLength = Math.min(minLength, i - pointer + 1);
                sum -= nums[pointer];
                pointer++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
