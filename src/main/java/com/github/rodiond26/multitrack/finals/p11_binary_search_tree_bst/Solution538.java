package com.github.rodiond26.multitrack.finals.p11_binary_search_tree_bst;

class Solution538 {
    private int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        dfs(root);
        return root;
    }

    private void dfs(TreeNode node) {
        if (node == null) {
            return;
        }

        dfs(node.right);
        sum += node.val;
        node.val = sum;
        dfs(node.left);
    }
}
