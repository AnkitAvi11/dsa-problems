package org.example.recursions;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {this.next = null;}

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    ListNode(int val, ListNode next) {
        this.next = next;
    }
}
