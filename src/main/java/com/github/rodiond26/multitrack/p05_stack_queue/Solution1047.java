package com.github.rodiond26.multitrack.p05_stack_queue;

import java.util.Stack;

class Solution1047 {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(ch);
            } else {
                if (stack.peek().equals(ch)) {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Character ch : stack) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
