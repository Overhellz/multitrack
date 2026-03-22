package com.github.rodiond26.multitrack.p02_binary_search;

class Solution74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            int middleValue = matrix[middle / cols][middle % cols];

            if (middleValue == target) {
                return true;
            } else if (middleValue > target) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return false;
    }
}
