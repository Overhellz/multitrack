package com.github.rodiond26.multitrack.finals.p10_binary_tree_bfs;

import java.util.*;

class Solution103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        List<List<Integer>> result = new ArrayList<>();
        boolean leftToRight = true;

        // FIFO
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                level.add(current.val);

                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }

            if (!leftToRight) {
                Collections.reverse(level);
            }
            result.add(level);
            leftToRight = !leftToRight;
        }
        return result;
    }
}
