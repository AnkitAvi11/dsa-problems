package org.example.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *  <a href="https://leetcode.com/problems/subarray-sum-equals-k/description/">...</a>
 */
public class SubArraySumEqualsK {

    public int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int el : nums) {
            sum += el;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1};
        int k = 2;

        SubArraySumEqualsK object = new SubArraySumEqualsK();
        System.out.println(object.subarraySum(arr, k));
    }
}
