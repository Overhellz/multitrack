package com.github.rodiond26.multitrack.p06_linked_list;

class Solution206 {
    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        ListNode oldHead = head;

        while (oldHead != null) {
            ListNode next = oldHead.next;
            oldHead.next = newHead;
            newHead = oldHead;
            oldHead = next;
        }
        return newHead;
    }
}
