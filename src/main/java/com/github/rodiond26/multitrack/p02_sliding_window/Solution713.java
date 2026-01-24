package com.github.rodiond26.multitrack.p02_sliding_window;

// from 16:12 to 16:20 is 8 min
class Solution713 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int currentProduct = nums[i];

            if (currentProduct < k) {
                count += 1;
            }

            for (int j = i + 1; j < nums.length; j++) {
                currentProduct = currentProduct * nums[j];
                if (currentProduct < k) {
                    count += 1;
                } else {
                    break;
                }
            }
        }

        return count;
    }
}
