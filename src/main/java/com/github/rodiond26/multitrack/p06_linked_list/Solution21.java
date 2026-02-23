package com.github.rodiond26.multitrack.p06_linked_list;

class Solution21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode first = list1;
        ListNode second = list2;
        ListNode dummy = new ListNode();
        ListNode head = dummy;

        while (first != null && second != null) {
            if (first.val < second.val) {
                head.next = first;
                first = first.next;
            } else {
                head.next = second;
                second = second.next;
            }
            head = head.next;
        }

        if (first != null) {
            head.next = first;
        }
        if (second != null) {
            head.next = second;
        }

        return dummy.next;
    }
}
