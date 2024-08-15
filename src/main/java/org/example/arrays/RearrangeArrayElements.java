package org.example.arrays;

/**
 * Problem link : <a href="https://leetcode.com/problems/rearrange-array-elements-by-sign/">...</a>
 */
public class RearrangeArrayElements {

    public int[] rearrangeArray(int[] nums) {
        int [] arr = new int[nums.length];
        int evenindex = 0;
        int oddindex = 1;

        for (int num : nums) {
            if (num > 0) {
                arr[evenindex] = num;
                evenindex += 2;
            } else {
                arr[oddindex] = num;
                oddindex += 2;
            }
        }
        return arr;
    }

    public static void main(String[] args) {

    }
}
