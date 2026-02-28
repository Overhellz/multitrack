package com.github.rodiond26.multitrack.p01_hash_map;

import java.util.HashMap;
import java.util.Map;

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valueToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int toFind = target - current;
            if (valueToIndex.containsKey(toFind)) {
                return new int[]{i, valueToIndex.get(toFind)};
            } else {
                valueToIndex.put(current, i);
            }
        }
        throw new RuntimeException();
    }
}
