package com.github.rodiond26.multitrack.p03_prefix_sum;

// 12:53 - 13:04 = 11 min

import java.util.HashMap;
import java.util.Map;

class Solution1248 {
    public int numberOfSubarrays(int[] nums, int k) {
        int[] arr = new int[nums.length];

        arr[0] = nums[0] % 2;
        for (int i = 1; i < nums.length; i++) {
            arr[i] = nums[i] % 2;
        }

        Map<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1);

        int niceCount = 0;
        int currentSum = 0;

        for (int val : arr) {
            currentSum += val;

            if (prefixSumCount.containsKey(currentSum - k)) {
                niceCount += prefixSumCount.get(currentSum - k);
            }

            prefixSumCount.put(currentSum, prefixSumCount.getOrDefault(currentSum, 0) + 1);
        }

        return niceCount;
    }
}
