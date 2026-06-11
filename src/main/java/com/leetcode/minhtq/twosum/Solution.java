package com.leetcode.minhtq.twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    // Solution 1
    // Time: O(n^2)
    // Space: O(1)
    public int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    // Solution 2
    // Time: O(n)
    // Space: O(n)
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int rem = target - nums[i];
            if (hashMap.containsKey(rem)) {
                return new int[]{hashMap.get(rem), i};
            }
            hashMap.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        long startTime1 = System.nanoTime();
        int[] res1 = s.twoSum1(nums, target);
        System.out.println("res1: " + Arrays.toString(res1) + ", executed in: " + (System.nanoTime() - startTime1) / 1e9);

        long startTime2 = System.nanoTime();
        int[] res2 = s.twoSum2(nums, target);
        System.out.println("res2: " + Arrays.toString(res2) + ", executed in: " + (System.nanoTime() - startTime2) / 1e9);
    }
}
