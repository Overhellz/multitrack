package com.github.rodiond26.multitrack.finals.p10_binary_tree_bfs;

import java.util.*;

class Solution515 {
    public List<Integer> largestValues(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        List<Integer> result = new ArrayList<>();

        while (!queue.isEmpty()) {
            int size = queue.size();
            int max = queue.peek().val;

            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                max = Math.max(max, current.val);

                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }

            result.add(max);
        }

        return result;
    }
}
