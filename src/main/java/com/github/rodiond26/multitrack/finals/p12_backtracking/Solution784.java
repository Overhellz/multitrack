package com.github.rodiond26.multitrack.finals.p12_backtracking;

import java.util.ArrayList;
import java.util.List;

class Solution784 {
    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        dfs(s, 0, "", result);
        return result;
    }

    // TODO snippet
    private void dfs(String s, int index, String current, List<String> result) {
        if (index == s.length()) {
            result.add(current);
            return;
        }

        char ch = s.charAt(index);
        if (Character.isDigit(ch)) {
            dfs(s, index + 1, current + ch, result);
        } else {
            dfs(s, index + 1, current + Character.toLowerCase(ch), result);
            dfs(s, index + 1, current + Character.toUpperCase(ch), result);
        }
    }
}
