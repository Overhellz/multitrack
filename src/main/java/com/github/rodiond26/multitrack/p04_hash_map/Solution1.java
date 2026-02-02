package com.github.rodiond26.multitrack.p04_hash_map;

import java.util.HashMap;
import java.util.Map;

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            int num = target - currentNum;

            if (map.containsKey(num)) {
                return new int[]{i, map.get(num)};
            } else {
                map.put(currentNum, i);
            }
        }

        throw new RuntimeException();
    }
}
