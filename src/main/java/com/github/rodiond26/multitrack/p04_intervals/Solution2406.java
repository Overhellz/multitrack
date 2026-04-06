package com.github.rodiond26.multitrack.p04_intervals;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Solution2406 {
    public int minGroups(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(arr -> arr[0]));
        int groups = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];

            if (minHeap.isEmpty()) {
                minHeap.add(end);
            } else {
                int current = minHeap.peek();
                if (current < start) {
                    minHeap.poll();
                    minHeap.add(end);
                } else {
                    minHeap.add(end);
                }
            }

            groups = Math.max(groups, minHeap.size());
        }
        return groups;
    }
}
