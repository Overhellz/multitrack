package com.github.rodiond26.multitrack.finals.p12_backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution257 {
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        List<String> result = new ArrayList<>();
        dfs(root, "", result);
        return result;
    }

    private void dfs(TreeNode node, String path, List<String> result) {
        path += node.val;

        // DFS (pre-order)
        if (node.left == null && node.right == null) {
            result.add(path);
            return;
        }
        if (node.left != null) {
            dfs(node.left, path + "->", result);
        }
        if (node.right != null) {
            dfs(node.right, path + "->", result);
        }
    }
}
