package com.github.rodiond26.multitrack.finals.p10_binary_tree_bfs;

import java.util.ArrayDeque;
import java.util.Queue;

class Solution513 {
    public int findBottomLeftValue(TreeNode root) {

        int left = root.val;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                if (i == 0) {
                    left = current.val;
                }

                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
        }

        return left;
    }
}
