package com.github.rodiond26.multitrack.p01_hash_map;

import java.util.HashMap;
import java.util.Map;

class Solution136 {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> valueCount = new HashMap<>();
        for (int num : nums) {
            valueCount.put(num, valueCount.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : valueCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        throw new RuntimeException();
    }
}
