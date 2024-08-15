package org.example.recursions;

public class ReverseLinkedList {

    private static ListNode reverseList(ListNode head, ListNode prev, ListNode current, ListNode next) {
        if (current == null)
            return head;

        current.next = prev;    //  reversing the current node
        head = current; //  making the current node as the head
        prev = current; //  prev node as the current node
        current = next; //  current node becomes the next node
        next = current != null ? current.next : null;

        return reverseList(head, prev, current, next);
    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        return reverseList(head, null, head, head.next);
    }

    public static void main(String[] args) {

    }
}
