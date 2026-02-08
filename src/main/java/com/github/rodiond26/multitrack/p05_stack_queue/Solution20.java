package com.github.rodiond26.multitrack.p05_stack_queue;

import java.util.*;
import java.util.Map;

class Solution20 {
    public boolean isValid(String s) {
        Map<Character, Character> map = Map.of(
                '(', ')',
                '{', '}',
                '[', ']'
        );

        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
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
