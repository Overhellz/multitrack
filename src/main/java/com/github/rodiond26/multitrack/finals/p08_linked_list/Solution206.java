package com.github.rodiond26.multitrack.finals.p08_linked_list;

class Solution206 {
    public ListNode reverseList(ListNode head) { // TODO snippet
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
