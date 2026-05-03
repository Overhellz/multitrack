package com.github.rodiond26.multitrack.finals.p06_intervals;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Solution2406 {
    public int minGroups(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(arr -> arr[0]));
        int maxSize = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            if (pq.isEmpty()) {
                pq.add(end);
                continue;
            } else {
                int current = pq.peek();
                if (current < start) {
                    pq.poll();
                    pq.add(end);
                } else {
                    pq.add(end);
                }
            }

            maxSize = Math.max(maxSize, pq.size());
        }

        return maxSize;
    }
}
