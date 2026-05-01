package com.github.rodiond26.multitrack.finals.p01_hash_map;

import java.util.HashMap;
import java.util.Map;

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            // num + toFindNum = target >>>>>>>>> toFindNum = target - num
            int toFindNum = target - num;
            if (map.containsKey(toFindNum)) {
                return new int[]{i, map.get(toFindNum)};
            }
            map.put(num, i);
        }
        return null;
    }
}
