package com.github.rodiond26.multitrack.finals.p10_binary_tree_bfs;

import java.util.ArrayDeque;
import java.util.Queue;

class Solution116 {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }

        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            Node prev = null;

            for (int i = 0; i < size; i++) {
                Node current = queue.poll();
                if (i > 0) {
                    prev.next = current;
                }
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }

                prev = current;
            }
        }

        return root;
    }
}
