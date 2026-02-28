package com.github.rodiond26.multitrack.p01_hash_map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

class Solution451 {
    public String frequencySort(String s) {
        Map<Character, Integer> characterCount = new HashMap<>();
        for (char ch : s.toCharArray()) {
            characterCount.put(ch, characterCount.getOrDefault(ch, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();
        characterCount.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(
                        entry -> {
                            char ch = entry.getKey();
                            int count = entry.getValue();
                            for (int i = 0; i < count; i++) {
                                sb.append(ch);
                            }
                        }
                );

        return sb.toString();
    }
}
