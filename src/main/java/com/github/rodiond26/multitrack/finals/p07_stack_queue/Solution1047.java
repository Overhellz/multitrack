package com.github.rodiond26.multitrack.finals.p07_stack_queue;

import java.util.Stack;
import java.util.stream.Collectors;

class Solution1047 {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (sb.isEmpty()) {
                sb.append(ch);
            } else {
                if (sb.charAt(sb.length() - 1) == ch) {
                    sb.deleteCharAt(sb.length() - 1);
                } else {
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }

    public String removeDuplicates2(String s) {
        Stack<Character > stack = new Stack<>();

        for (char ch : s.toCharArray()) {
             if (stack.isEmpty()) {
                 stack.push(ch);
             } else {
                 if (stack.peek() == ch) {
                     stack.pop();
                 } else {
                     stack.push(ch);
                 }
             }
        }

        return stack.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
