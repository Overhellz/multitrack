package com.github.rodiond26.multitrack.finals.p07_stack_queue;

import java.util.Stack;
import java.util.stream.Collectors;

class Solution2390 {
    public String removeStars(String s) {
        char star = '*';
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (stack.isEmpty()) {
                if (ch != star) {
                    stack.push(ch);
                }
            } else {
                if (ch == star) {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
        }

        return stack.stream()
                .map((String::valueOf))
                .collect(Collectors.joining());
    }
}
