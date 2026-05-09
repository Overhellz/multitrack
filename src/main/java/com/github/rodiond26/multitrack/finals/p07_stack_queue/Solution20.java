package com.github.rodiond26.multitrack.finals.p07_stack_queue;

import java.util.Map;
import java.util.Stack;

class Solution20 {
    public boolean isValid(String s) {
        Map<Character, Character> map = Map.of(
                '(', ')',
                '{', '}',
                '[', ']');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (map.containsKey(ch)) {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if (map.get(stack.peek()) == ch) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
