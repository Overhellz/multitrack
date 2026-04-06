package com.github.rodiond26.multitrack.p04_intervals;

import java.util.*;

class Solution763 {
    public List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList<>();
        int[][] intervals = new int[26][2];
        for (int i = 0; i < intervals.length; i++) {
            intervals[i][0] = -1;
            intervals[i][1] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if (intervals[index][0] == -1) {
                intervals[index][0] = i;
            }
            intervals[index][1] = i;
        }

        List<int[]> list = new ArrayList<>();
        for (int[] interval : intervals) {
            if (interval[0] != -1) {
                list.add(interval);
            }
        }
        list.sort(Comparator.comparingInt(arr -> arr[0]));

        int currentStart = list.getFirst()[0];
        int currentEnd = list.getFirst()[1];

        for (int i = 1; i < list.size(); i++) {
            int[] next = list.get(i);
            if (next[0] < currentEnd) {
                currentEnd = Math.max(currentEnd, next[1]);
            } else {
                result.add(currentEnd - currentStart + 1);
                currentStart = next[0];
                currentEnd = next[1];
            }
        }
        result.add(currentEnd - currentStart + 1);

        return result;
    }
}
