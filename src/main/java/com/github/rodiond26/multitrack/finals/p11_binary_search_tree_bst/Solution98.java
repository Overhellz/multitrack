package com.github.rodiond26.multitrack.finals.p11_binary_search_tree_bst;

class Solution98 {
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        return isValidBST2(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValidBST2(TreeNode root, long minValue, long maxValue) {
        if (root == null) {
            return true;
        }
        if (root.val <= minValue || root.val >= maxValue) {
            return false;
        }
        return isValidBST2(root.left, minValue, root.val)
                && isValidBST2(root.right, root.val, maxValue);
    }
}
