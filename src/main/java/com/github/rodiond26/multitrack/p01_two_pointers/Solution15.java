package com.github.rodiond26.multitrack.p01_two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // NLogN
        List<List<Integer>> result = new ArrayList<>();

        int left;
        int right;

        for (int i = 0; i < nums.length - 2; i++) {
            left = i + 1;
            right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(List.of(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result.stream().distinct().toList();
    }
}
