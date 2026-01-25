package com.github.rodiond26.multitrack.p03_prefix_sum;

import java.util.HashMap;
import java.util.Map;

// 12:38 - 12:51 = 13 min
class Solution560 {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixSumCount = new HashMap<>();

        // initialization
        prefixSumCount.put(0, 1);

        int currentSum = 0;
        int count = 0;

        for (int num : nums) {
            currentSum += num;

            if (prefixSumCount.containsKey(currentSum - k)) {
                count += prefixSumCount.get(currentSum - k);
            }

            prefixSumCount.put(currentSum, prefixSumCount.getOrDefault(currentSum, 0) + 1);

        }

        return count;
    }
}
