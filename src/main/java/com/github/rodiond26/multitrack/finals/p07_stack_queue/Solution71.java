package com.github.rodiond26.multitrack.finals.p07_stack_queue;

import java.util.Stack;

class Solution71 {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] dirs = path.split("/");

        for (String dir : dirs) {
            switch (dir) {
                case "":
                    continue;
                case ".":
                    continue;
                case "..":
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                    break;
                default:
                    stack.push(dir);
                    break;
            }
        }

        String p = String.join("/", stack); // TODO snippet
        return '/' + p;
    }
}
