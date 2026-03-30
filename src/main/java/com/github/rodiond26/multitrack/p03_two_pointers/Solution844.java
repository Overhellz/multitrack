package com.github.rodiond26.multitrack.p03_two_pointers;

class Solution844 {
    public boolean backspaceCompare(String s, String t) {
        return type(s).equals(type(t));
    }

    private String type(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '#' && sb.isEmpty()) {
             } else if (str.charAt(i) == '#') {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
