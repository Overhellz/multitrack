package com.github.rodiond26.multitrack.p04_intervals;

import java.util.Arrays;
import java.util.Comparator;

class Solution452 {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(arr -> arr[0]));
        int arrows = 1;
        int lastEnd = points[0][1];

        for (int i = 1; i < points.length; i++) {
            int start = points[i][0];
            int end = points[i][1];

            if (start > lastEnd) {
                arrows++;
                lastEnd = end;
            } else {
                lastEnd = Math.min(lastEnd, end);
            }
        }

        return arrows;
    }
}
