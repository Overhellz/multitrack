package com.github.rodiond26.multitrack.finals.p07_stack_queue;

import java.util.Stack;

class Solution155 {
}

class MinStack {

    private final Stack<Integer> stack;
    private final Stack<Integer> minStack;

    public MinStack() {
        this.stack = new Stack<>();
        this.minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);

        if (minStack.isEmpty()) {
            minStack.push(val);
        } else {
            int min = Math.min(minStack.peek(), val);
            minStack.push(min);
        }
    }

    public void pop() {
        if (!stack.isEmpty()) {
            stack.pop();
        }
        if (!minStack.isEmpty()) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
