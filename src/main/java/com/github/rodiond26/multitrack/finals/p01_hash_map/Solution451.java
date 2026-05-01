package com.github.rodiond26.multitrack.finals.p01_hash_map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

class Solution451 {
    public String frequencySort(String s) {
        Map<Character, Integer> charCount = new HashMap<>(); // key - char, value - count
        for (int i = 0; i < s.length(); i++) {
            charCount.put(s.charAt(i), charCount.getOrDefault(s.charAt(i), 0) + 1);
        }

        StringBuilder sb = new StringBuilder();
        charCount.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(entry -> {
                    for (int i = 0; i < entry.getValue(); i++) {
                        sb.append(entry.getKey());
                    }
                });

        return sb.toString();
    }
}
