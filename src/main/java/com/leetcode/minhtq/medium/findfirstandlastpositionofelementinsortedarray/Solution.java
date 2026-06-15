package com.leetcode.minhtq.medium.findfirstandlastpositionofelementinsortedarray;

import com.google.gson.Gson;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{findFirst(nums, target), findLast(nums, target)};
    }

    private int findFirst(int[] nums, int target) {
        int l = 0, r = nums.length - 1, result = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                result = mid;
                r = mid - 1; // tiếp tục tìm bên trái
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return result;
    }

    private int findLast(int[] nums, int target) {
        int l = 0, r = nums.length - 1, result = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                result = mid;
                l = mid + 1; // tiếp tục tìm bên phải
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1};
        System.out.println(new Gson().toJson(solution.searchRange(nums, 7)));
    }
}
