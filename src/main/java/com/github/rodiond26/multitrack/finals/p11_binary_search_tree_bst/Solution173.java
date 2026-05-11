package com.github.rodiond26.multitrack.finals.p11_binary_search_tree_bst;

import java.util.Stack;

class Solution173 {
}

class BSTIterator {

    private Stack<TreeNode> stack = new Stack<>();

    public BSTIterator(TreeNode root) {
        pushAllLeft(root);
    }

    public int next() {
        TreeNode node = stack.pop();

        if (node.right != null) {
            pushAllLeft(node.right);

        }
        return node.val;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    private void pushAllLeft(TreeNode node) {
        while (node != null) {
            stack.add(node);
            node = node.left;
        }
    }
}
