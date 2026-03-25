package com.github.rodiond26.multitrack.p05_prefix_sum;

import java.util.HashMap;
import java.util.Map;

class Solution525 {
    public int findMaxLength(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                arr[i] = -1;
            } else {
                arr[i] = 1;
            }
        }

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum)) {
                int len = i - map.get(sum);
                maxLen = Math.max(maxLen, len);
            } else {
                map.put(sum, i);
            }
        }
        return maxLen;
    }
}
