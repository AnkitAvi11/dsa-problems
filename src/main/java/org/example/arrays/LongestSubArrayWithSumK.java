package org.example.arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumK {

    public static int lenOfLongSubarr(int[] arr, int n, int k) {
        Map<Integer, Integer> hashmap = new HashMap<>();
        int l = 0;
        int s = 0;
        for(int i = 0;i < n; i++) {
            s += arr[i];
            if(s == k) {
                l = i + 1;
            }else{
                if(hashmap.containsKey(s - k)) {
                    l = Math.max(l, i - hashmap.get(s - k));
                }
            }

            if(!hashmap.containsKey(s)) {
                hashmap.put(s, i);
            }
        }

        return l;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int n = arr.length;
        int k = 15;
        System.out.println(lenOfLongSubarr(arr, n, k));
    }
}
