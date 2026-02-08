package com.github.rodiond26.multitrack.p05_stack_queue;

import java.util.Stack;

class Solution71 {
    public String simplifyPath(String path) {
        String slash = "/";
        String[] arr = path.split("/");
        Stack<String> stack = new Stack<>();

        for (String str : arr) {
            switch (str) {
                case "", "." -> {
                    continue;
                }
                case ".." -> {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                    continue;
                }
            }
            stack.push(str);
        }

        if (stack.isEmpty()) {
            return "/";
        }

        StringBuilder sb = new StringBuilder();
        for (String str : stack) {
            sb.append("/");
            sb.append(str);
        }
        return sb.toString();
    }
}
