package com.github.rodiond26.multitrack.finals.p09_binary_tree_dfs;

class Solution114 {
    private TreeNode prev = null;

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }

        flatten(root.left);
        flatten(root.right);

        root.right = prev;
        root.left = null;
        prev = root;
    }
}
