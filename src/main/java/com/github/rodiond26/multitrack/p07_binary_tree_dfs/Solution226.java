package com.github.rodiond26.multitrack.p07_binary_tree_dfs;

class Solution226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode dummy = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(dummy);
        return root;
    }
}
