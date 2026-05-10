package com.github.rodiond26.multitrack.finals.p10_binary_tree_bfs;

import java.util.*;

class Solution1302 {
    public int deepestLeavesSum(TreeNode root) {
        int sum = 0;

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                sum += current.val;

                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
        }

        return sum;
    }
}
