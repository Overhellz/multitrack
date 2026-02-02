package com.github.rodiond26.multitrack.p04_hash_map;

import java.util.HashMap;
import java.util.Map;

class Solution136 {
    public int singleNumber1(int[] nums) {
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            result = result ^ nums[i];
        }

        return result;
    }

    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return map.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst()
                .get()
                .getKey();
    }
}