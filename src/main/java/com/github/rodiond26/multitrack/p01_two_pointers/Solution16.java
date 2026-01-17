package com.github.rodiond26.multitrack.p01_two_pointers;

import java.util.Arrays;

class Solution16 {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);

        int sum = nums[0] + nums[1] + nums[2];
        int diff = Math.abs(sum - target);

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];
                int currentDiff = Math.abs(currentSum - target);

                if (currentSum == target) {
                    return currentSum;
                }

                if (currentDiff < diff) {
                    diff = currentDiff;
                    sum = currentSum;
                }

                if (currentSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return sum;
    }
}
