package com.github.rodiond26.multitrack.p04_sliding_window;

class Solution209 {
    public int minSubArrayLen(int target, int[] nums) {
        int begin = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int end = 0; end < nums.length; end++) {
            sum += nums[end];

            while (sum >= target) {
                minLength = Math.min(minLength, end - begin + 1);
                sum -= nums[begin];
                begin++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 :     minLength;
    }
}
