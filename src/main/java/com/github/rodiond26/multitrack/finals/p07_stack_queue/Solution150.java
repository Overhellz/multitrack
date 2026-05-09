package com.github.rodiond26.multitrack.finals.p07_stack_queue;

import java.util.*;

class Solution150 {
    public int evalRPN(String[] tokens) {
         Stack<Integer> stack = new Stack<>();
        Set<String> operators= Set.of("+", "-", "*",  "/");

        for (String token : tokens) {
            if (!operators.contains(token)) {
                stack.push(Integer.valueOf(token));
                continue;
            }

            int second = stack.pop();
            int first = stack.pop();
            int result;
            if (token.equals("+")) {
                result = first + second;
            } else if (token.equals("-")) {
                result = first - second;
            } else if (token.equals("*")) {
                result = first * second;
            } else {
                result = first / second;
            }
            stack.push(result);
        }

        return stack.peek();
    }
}
