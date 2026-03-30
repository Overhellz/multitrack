package com.github.rodiond26.multitrack.p03_two_pointers;

class Solution392 {
    public boolean isSubsequence(String s, String t) {
        if (s == null || s.isEmpty()) {
            return true;
        }

        int p = 0;

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(p)) {
                p++;
                if (p == s.length()) {
                    return true;
                }
            }
        }
        return false;
    }
}
