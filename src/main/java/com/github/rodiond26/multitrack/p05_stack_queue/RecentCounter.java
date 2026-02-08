package com.github.rodiond26.multitrack.p05_stack_queue;

import java.util.ArrayDeque;
import java.util.Deque;

class RecentCounter {

    private final Deque<Integer> deque;

    public RecentCounter() {
        deque = new ArrayDeque<>();
    }

    public int ping(int t) {
        deque.addLast(t);

        while (!deque.isEmpty() && deque.getLast() - deque.getFirst() > 3000) {
            deque.pollFirst();
        }

        return deque.size();
    }
}
