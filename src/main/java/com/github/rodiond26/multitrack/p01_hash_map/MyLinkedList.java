package com.github.rodiond26.multitrack.p01_hash_map;

class MyLinkedList {
    Node head;

    int get(int key) {
        Node current = head;
        while (current != null) {
            if (current.key == key) {
                return current.value;
            }
            current = current.next;
        }
        return -1;
    }

    void put(int key, int value) {
        Node current = head;
        while (current != null) {
            if (current.key == key) {
                current.value = value;
                return;
            }
            current = current.next;
        }

        head = new Node(key, value, head);
    }

    void remove(int key) {
        if (head == null) {
            return;
        }
        if (head.key == key) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.key == key) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
}
