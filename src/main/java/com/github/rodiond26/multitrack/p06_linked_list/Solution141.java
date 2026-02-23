package com.github.rodiond26.multitrack.p06_linked_list;

class Solution141 {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (true) {
            if (fast.next == null || fast.next.next == null) {
                return false;
            }
            if (slow == fast.next) {
                return true;
            }

            slow = slow.next;
            fast = fast.next.next;
        }
    }
}
