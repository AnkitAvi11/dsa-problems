package org.example.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInAnArray {


    static ArrayList<Integer> leaders(int n, int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();

        int lastMax = arr[arr.length - 1];
        ans.add(lastMax);

        int index = arr.length - 2;
        while (index >= 0) {
            if (arr[index] >= lastMax) {
                lastMax = arr[index];
                ans.add(lastMax);
            }

            index--;
        }

        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};

        ArrayList<Integer> ans = leaders(arr.length, arr);
        Collections.reverse(ans);
        for (int el : ans) {
            System.out.print(el + " : ");
        }
    }
}
