package com.github.rodiond26.multitrack.p01_hash_map;

import java.util.*;

class Solution49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Integer, List<String>> map = new HashMap<>();
        for (String str : strs) {
            int hash = hash(str);
            if (!map.containsKey(hash)) {
                map.put(hash, new ArrayList<>());
            }
            map.get(hash).add(str);
        }
        return map.values().stream().toList();
    }

    // TODO: snippet
    public int hash(String str) {
        int[] counts = new int[26];
        for (char c : str.toCharArray()) {
            counts[c - 'a']++;
        }
        return Arrays.hashCode(counts);
    }
}
