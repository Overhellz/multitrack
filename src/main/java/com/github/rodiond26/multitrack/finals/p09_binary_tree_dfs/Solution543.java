package com.github.rodiond26.multitrack.finals.p09_binary_tree_dfs;

class Solution543 {
    private int result = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        diameter(root);
        return result;
    }

    private int diameter(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = diameter(root.left);
        int right = diameter(root.right);
        result = Math.max(result, left + right);
        return Math.max(left, right) + 1;
    }
}
