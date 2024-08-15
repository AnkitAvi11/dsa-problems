package org.example.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElements {

    public int votingAlgorithm(int[] nums) {
        int count = 1;
        int num = nums[0];

        for (int i = 1 ; i < nums.length ; i++) {
            if (count == 0) {
                num = nums[i];
                count = 1;
            } else if (nums[i] == num) {
                count++;
            } else {
                count--;
            }
        }

        return num;
    }

    public int solutionWithHashMap(int[] nums) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int el : nums) {
            hashMap.put(el, hashMap.getOrDefault(el, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() >= nums.length / 2) return entry.getKey();
        }

        return -1;
    }

    public int sortingSolution(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public int majorityElement(int[] nums) {
        return solutionWithHashMap(nums);
    }

    public static void main(String[] args) {

    }
}
