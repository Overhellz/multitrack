package com.github.rodiond26.multitrack.p03_two_pointers;

import java.util.Arrays;

class Solution16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        // текущая сумма
        // текущий diff
        int currentSum = nums[0] + nums[1] + nums[2];
        int currentDiff = Math.abs(currentSum - target);

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == target) {
                    return sum;
                }

                int diff = Math.abs(sum - target);
                if (diff < currentDiff) {
                    currentDiff = diff;
                    currentSum = sum;
                }

                if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return currentSum;
    }
}
