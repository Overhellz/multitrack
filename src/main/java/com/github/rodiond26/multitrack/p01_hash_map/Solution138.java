package com.github.rodiond26.multitrack.p01_hash_map;

import java.util.HashMap;
import java.util.Map;

class Solution138 {
    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();

        Node current = head;
        while (current != null) {
            map.put(current, new Node(current.val));
            current = current.next;
        }

        current = head;
        while (current != null) {
            map.get(current).next = map.get(current.next);
            map.get(current).random = map.get(current.random);
            current = current.next;
        }

        return map.get(head);
    }
} 
