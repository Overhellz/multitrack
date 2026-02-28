package com.github.rodiond26.multitrack.p01_hash_map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Solution347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> valueCount = new HashMap<>();
        for (int num : nums) {
            valueCount.put(num, valueCount.getOrDefault(num, 0) + 1);
        }

        return valueCount.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(k)
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
}
