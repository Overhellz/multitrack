package com.github.rodiond26.multitrack.finals.p04_sliding_window;

import java.util.HashMap;
import java.util.Map;

class Solution424 {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int max = 0;
        int maxFrequency = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
            maxFrequency = Math.max(maxFrequency, map.get(ch));

            while ((right - left + 1) - maxFrequency > k) {
                char leftChar = s.charAt(left);
                int leftCharCount = map.get(leftChar);

                if (leftCharCount == 1) {
                    map.remove(leftChar);
                } else {
                    map.put(leftChar, leftCharCount - 1);
                }
                left++;
            }

            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
