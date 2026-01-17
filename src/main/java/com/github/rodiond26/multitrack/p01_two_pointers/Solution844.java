package com.github.rodiond26.multitrack.p01_two_pointers;

class Solution844 {
    public boolean backspaceCompare(String s, String t) {
        return toString(s).equals(toString(t));
    }

    private String toString(String str) {
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '#') {
                if (!sb1.isEmpty()) {
                    sb1.deleteCharAt(sb1.length() - 1);
                }
            } else {
                sb1.append(str.charAt(i));
            }
        }
        return sb1.toString();
    }

    public static void main(String[] args) {
        Solution844 s = new Solution844();
        s.backspaceCompare("xywrrmp", "xywrrmu#p");
    }
}
