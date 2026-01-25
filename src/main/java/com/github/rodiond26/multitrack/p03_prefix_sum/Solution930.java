package com.github.rodiond26.multitrack.p03_prefix_sum;

// 13:05 - 13:11 = 6 min

import java.util.HashMap;
import java.util.Map;

class Solution930 {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1);

        int currentSum = 0;
        int count = 0;

        for (int num : nums) {
            currentSum += num;

            if (prefixSumCount.containsKey(currentSum - goal)) {
                count += prefixSumCount.get(currentSum - goal);
            }

            prefixSumCount.put(currentSum, prefixSumCount.getOrDefault(currentSum, 0) + 1);
        }
        return count;
    }
}
