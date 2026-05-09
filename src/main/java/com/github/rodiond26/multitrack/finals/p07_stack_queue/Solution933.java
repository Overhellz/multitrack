package com.github.rodiond26.multitrack.finals.p07_stack_queue;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution933 {
}

class RecentCounter {

    private final Deque<Integer> deque;
    private final int interval = 3000;

    public RecentCounter() {
        deque = new ArrayDeque<>();
    }

    public int ping(int t) {
        deque.addLast(t);

        while (deque.getLast() - deque.getFirst() > interval) {
            deque.removeFirst();
        }

        return deque.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */