package com.github.rodiond26.multitrack.finals.p07_stack_queue;

import java.util.*;

class Solution232 {
}

class MyQueue {

    private final Stack<Integer> pushStack;
    private final Stack<Integer> popStack;

    public MyQueue() {
        pushStack = new Stack<>();
        popStack = new Stack<>();
    }

    public void push(int x) {
        pushStack.push(x);
    }

    public int pop() {
        if (popStack.empty()) {
            transfer();
        }
        return popStack.pop();
    }

    public int peek() {
        if (popStack.empty()) {
            transfer();
        }
        return popStack.peek();
    }

    public boolean empty() {
        return pushStack.isEmpty() && popStack.isEmpty();
    }

    private void transfer() {
        while (!pushStack.isEmpty()) {
            popStack.push(pushStack.pop());
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
