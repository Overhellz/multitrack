package com.github.rodiond26.multitrack.finals.p08_linked_list;

class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        int temp = 0;

        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + temp;
            ListNode next = new ListNode(sum % 10);
            temp = sum / 10;
            current.next = next;
            current = current.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            int sum = l1.val + temp;
            ListNode next = new ListNode(sum % 10);
            temp = sum / 10;
            current.next = next;
            current = current.next;
            l1 = l1.next;
        }

        while (l2 != null) {
            int sum = l2.val + temp;
            ListNode next = new ListNode(sum % 10);
            temp = sum / 10;
            current.next = next;
            current = current.next;
            l2 = l2.next;
        }

        if (temp > 0) {
            ListNode next = new ListNode(temp);
            current.next = next;
        }

        return dummy.next;
    }
}
