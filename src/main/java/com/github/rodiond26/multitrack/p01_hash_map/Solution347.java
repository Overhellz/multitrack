package com.github.rodiond26.multitrack.p01_hash_map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

class Solution347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numCount = new HashMap<>();
        for (int num : nums) {
            numCount.put(num, numCount.getOrDefault(num, 0) + 1);
        }
        return numCount.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) // TODO hints
                .limit(k)
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
}
