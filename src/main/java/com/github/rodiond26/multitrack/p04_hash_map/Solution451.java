package com.github.rodiond26.multitrack.p04_hash_map;

import java.util.HashMap;
import java.util.Map;

class Solution451 {
    public String frequencySort(String s) {
        Map<Character, Integer> charCount = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            charCount.put(s.charAt(i), charCount.getOrDefault(s.charAt(i), 0) + 1);
        }

        StringBuilder result = new StringBuilder();

        charCount.entrySet().stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .forEach(entry -> {
                    char ch = entry.getKey();
                    int count = entry.getValue();
                    for (int i = 0; i < count; i++) {
                        result.append(ch);
                    }
                });

        return result.toString();
    }
}
