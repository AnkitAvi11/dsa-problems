package org.example.arrays;


import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/longest-consecutive-sequence/">...</a>
 */
public class LongestConsecutiveSequece {

    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int el : nums) set.add(el);
        int longest = Integer.MIN_VALUE;

        for (int el : set) {
            if (!set.contains(el - 1)) {
                int count = 1;
                int start = el;
                while (set.contains(start + 1)) {
                    count++;
                    start++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        LongestConsecutiveSequece sequence = new LongestConsecutiveSequece();
        int[] arr = {100,1,2,4,2,3,6,7,8,9};

        System
            .out
            .println("Longest sequence : " + sequence.longestConsecutive(arr));
    }
}
