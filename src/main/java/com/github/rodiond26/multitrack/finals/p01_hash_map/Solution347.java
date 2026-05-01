package com.github.rodiond26.multitrack.finals.p01_hash_map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

class Solution347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>(); // key - num, value - count
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        return count.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(k)
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
}
