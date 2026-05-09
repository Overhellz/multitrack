package com.github.rodiond26.multitrack.finals.p08_linked_list;

class Solution143 {

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        // middle
        ListNode middle = middle(head);


        // reverse after middle
        ListNode second = reverse(middle.next );
        middle.next = null;

        // merge two lists
        ListNode first = head;

        while (second != null) {
            ListNode nextFirst = first.next;
            ListNode nextSecond = second.next;

            first.next = second;
            second.next = nextFirst;

            first = nextFirst;
            second = nextSecond;
        }
    }

    private ListNode middle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    private ListNode reverse(ListNode head) { // TODO snippet
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }
}
