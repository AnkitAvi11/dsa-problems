package org.example.arrays;


public class NextPermutation {

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void reverse(int[] arr, int left, int right) {
        while (left <= right) {
            int temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }

    public void nextPermutation(int[] nums) {
        int i = nums.length - 1;
        while (i > 0) {
            if (nums[i] > nums[i - 1]) {
                break;
            }
            i--;
        }

        i--;
        swap(nums, i, nums.length - 1);
        reverse(nums, i + 1, nums.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        NextPermutation permutation = new NextPermutation();
        permutation.nextPermutation(arr);

        for (int el : arr) {
            System.out.print(el + " : ");
        }
    }
}
