package com.github.rodiond26.multitrack.p02_sliding_window;

class Solution1004 {
    public int longestOnes(int[] nums, int k) {
        int state = 0; // sliding window state is the count of flipped zeros
        int max = 0;
        int left = 0;
        int right = 0;

        for (; right < nums.length; right++) {
            if (nums[right] == 1) {
                max = Math.max(max, right - left + 1);
            } else {
                state += 1;

                while (state > k) {
                    if (nums[left] == 0) {
                        state -= 1;
                    }
                    left++;
                }
                max = Math.max(max, right - left + 1);
            }
        }
        return max;
    }
}
