package org.example.arrays;

public class BuildArrayFromPermutation {

    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        int i = 0;
        for (int el : ans) {
            ans[i++] = nums[el];
        }

        return ans;
    }

    public static void main(String[] args) {

    }
}
