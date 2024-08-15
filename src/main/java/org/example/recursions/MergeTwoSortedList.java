package org.example.recursions;

public class MergeTwoSortedList {

    public ListNode mergeTwoSortedList(ListNode head1, ListNode head2) {
        ListNode ptr1 = head1, ptr2 = head2;
        ListNode head = null, tail = null;

        while (ptr1 != null && ptr2 != null) {
            ListNode dataNode;
            if ( ptr1.val <= ptr2.val ) {
                dataNode = new ListNode(ptr1.val);
                ptr1 = ptr1.next;
            } else {
                dataNode = new ListNode(ptr2.val);
                ptr2 = ptr2.next;
            }

            if (head == null) {
                head = dataNode;
            } else {
                tail.next = dataNode;
            }
            tail = dataNode;
        }

        while (ptr1 != null) {
            ListNode dataNode = new ListNode(ptr1.val);
            ptr1 = ptr1.next;
            if (head == null) {
                head = dataNode;
            } else {
                tail.next = dataNode;
            }
            tail = dataNode;
        }

        while (ptr2 != null) {
            ListNode dataNode = new ListNode(ptr2.val);
            ptr2 = ptr2.next;
            if (head == null) {
                head = dataNode;
            } else {
                tail.next = dataNode;
            }
            tail = dataNode;
        }

        return head;
    }

    public static void main(String[] args) {

    }
}
