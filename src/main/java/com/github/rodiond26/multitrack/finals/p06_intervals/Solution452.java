package com.github.rodiond26.multitrack.finals.p06_intervals;

import java.util.*;

class Solution452 {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }

        Arrays.sort(points, Comparator.comparingInt(arr -> arr[1]));

        int arrows = 1;
        int end = points[0][1];

        for (int i = 1; i < points.length; i++) {
            int[] currentPoint = points[i];

            if (currentPoint[0] > end) {
                arrows++;
                end = currentPoint[1];
            }
        }

        return arrows;
    }
}
