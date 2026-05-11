package com.github.rodiond26.multitrack.finals.p11_binary_search_tree_bst;

import java.util.Stack;

class Solution230 {
    public int kthSmallest(TreeNode root, int k) {
        int n = 0;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.add(current);
                current = current.left;
            }

            current = stack.pop();
            n++;
            if (n == k) {
                return current.val;
            }

            current = current.right;
        }
        return -1;
    }
}
