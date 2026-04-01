package com.github.rodiond26.multitrack.p04_sliding_window;

class Solution1004 {
    public int longestOnes(int[] nums, int k) {
        int begin = 0;
        int maxLen = 0;
        int zeroCount = 0;

        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == 0) {
                zeroCount++;
            }

            while (zeroCount > k) {
                if (nums[begin] == 0) {
                    zeroCount--;
                }
                begin++;
            }
            maxLen = Math.max(maxLen, end - begin + 1);
        }

        return maxLen;
    }
}
