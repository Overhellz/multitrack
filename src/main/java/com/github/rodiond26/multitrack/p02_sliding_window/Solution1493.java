package com.github.rodiond26.multitrack.p02_sliding_window;

class Solution1493 {
    public int longestSubarray(int[] nums) {
        int max = 0;
        int count = 0;
        int start = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                max = Math.max(max, i - start + 1);
                continue;
            }

            if (count < 1) {
                count++;
                max = Math.max(max, i - start + 1);
                continue;
            }

            while (count >= 1) {
                if (nums[start] != 1) {
                    count--;
                    start++;
                }
            }
        }

        return max - 1;
    }
}
