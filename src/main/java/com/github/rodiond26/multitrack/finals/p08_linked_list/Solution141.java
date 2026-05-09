package com.github.rodiond26.multitrack.finals.p08_linked_list;

class Solution141 {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode fast = head.next;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            if (slow == fast) {
                return true;
            }

            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }
}
