package com.github.rodiond26.multitrack.finals.p08_linked_list;

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
            Node node = map.get(current);
            node.next = map.get(current.next);
            node.random = map.get(current.random);
            current = current.next;
        }

        return map.get(head);
    }
}
