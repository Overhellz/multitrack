package com.github.rodiond26.multitrack.p05_stack_queue;

import java.util.Stack;

class Solution2390 {
    public String removeStars(String s) {
        char star = '*';

        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == star) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Character ch : stack) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
