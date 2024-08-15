package org.example.recursions;

public class RemoveListElements {

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }

        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }

    //  Remove nodes part - II LEETCODE: 2487
    public ListNode removeNodes(ListNode head) {
        if (head == null) {
            return head;
        }

        head.next = removeNodes(head.next);
        if (head.next == null) return head;
        return head.val < head.next.val ? head.next : head;
    }

    public static void main(String[] args) {

    }
}
