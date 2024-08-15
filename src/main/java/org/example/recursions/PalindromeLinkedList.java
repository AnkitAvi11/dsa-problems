package org.example.recursions;

import java.util.Stack;

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        for (ListNode ptr = head ; ptr != null ; ptr = ptr.next) {
            stack.push(ptr.val);
        }

        ListNode ptr = head;
        while (ptr != null && !stack.isEmpty()) {
            if (ptr.val != stack.pop())
                return false;
            ptr = ptr.next;
        }

        return true;
    }
}
