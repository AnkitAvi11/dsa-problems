package org.example.recursions;

public class SubSetSum {

    public static long subSetSumProblem(int[] arr, int index, int actual, int sum) {
        if (index >= arr.length) {
            if (actual == sum)
                return 1;
            else
                return 0;
        }

        return subSetSumProblem(arr, index + 1, actual + arr[index], sum) +
                subSetSumProblem(arr, index + 1, actual, sum);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 15};
        int sum = 25;

        System.out.println(subSetSumProblem(arr, 0, 0, sum));
    }
}
