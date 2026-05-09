package com.github.rodiond26.multitrack.finals.p08_linked_list;

class Solution21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode head = dummy;
        ListNode first = list1;
        ListNode second = list2;

        while (first != null && second != null) {
            if (first.val <= second.val) {
                head.next = first;
                first = first.next;
            } else {
                head.next = second;
                second = second.next;
            }
            head = head.next;
        }

        while (first != null) {
            head.next = first;
            first = first.next;
            head = head.next;
        }

        while (second != null) {
            head.next = second;
            second = second.next;
            head = head.next;
        }

        return dummy.next;
    }
}
