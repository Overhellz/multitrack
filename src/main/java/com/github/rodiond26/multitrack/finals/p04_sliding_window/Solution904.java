package com.github.rodiond26.multitrack.finals.p04_sliding_window;

import java.util.HashMap;
import java.util.Map;

class Solution904 {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int max = 0;

        for (int right = 0; right < fruits.length; right++) {
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            while (map.size() > 2) {
                int leftCount = map.get(fruits[left]);
                if (leftCount == 1) {
                    map.remove(fruits[left]);
                } else {
                    map.put(fruits[left], leftCount - 1);
                }
                left++;
            }

            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
