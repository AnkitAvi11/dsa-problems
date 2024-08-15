package org.example.arrays;

/**
 * Link to the problem: <a href="https://leetcode.com/problems/sort-colors/description/">...</a>
 */
public class SortColors {

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void sortColors(int[] nums) {
        int left = 0, mid = 0, right = nums.length - 1;

        while (mid <= right) {
            if (nums[mid] == 0) {
                swap(nums, left++, mid++);
            } else if (nums[mid] == 2) {
                swap(nums, mid, right--);
            } else {
                mid++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,0,2,1,1,0};
        SortColors sortColors = new SortColors();
        sortColors.sortColors(arr);
        for (int el : arr) {
            System.out.print(el + " : ");
        }
    }
}
