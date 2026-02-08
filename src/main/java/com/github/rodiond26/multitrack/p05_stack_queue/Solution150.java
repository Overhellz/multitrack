package com.github.rodiond26.multitrack.p05_stack_queue;

import java.util.Set;
import java.util.Stack;

class Solution150 {
    public int evalRPN(String[] tokens) {
        Set<String> operators = Set.of("+", "-", "*", "/");
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (operators.contains(token)) {
                int b = stack.pop();
                int a = stack.pop();
                if (token.equals("+")) {
                    int result = a + b;
                    stack.push(result);
                }
                if (token.equals("-")) {
                    int result = a - b;
                    stack.push(result);
                }
                if (token.equals("*")) {
                    int result = a * b;
                    stack.push(result);
                }
                if (token.equals("/")) {
                    int result = a / b;
                    stack.push(result);
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.peek();
    }
}
