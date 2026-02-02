package com.github.rodiond26.multitrack.p04_hash_map;

import java.util.*;

public class Solution49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Integer, List<String>> hashToStringMap = new HashMap<>();

        for (String str : strs) {
            int hash = countHash(str);

            if (!hashToStringMap.containsKey(hash)) {
                hashToStringMap.put(hash, new ArrayList<>());
            }
            hashToStringMap.get(hash).add(str);
        }

        return hashToStringMap.values().stream().toList();
    }

    public int countHash(String str) {
        int[] counts = new int[26];
        for (char c : str.toCharArray()) {
            counts[c - 'a']++;
        }
        return Arrays.hashCode(counts);
    }
}
