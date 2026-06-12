package com.leetcode.minhtq.easy.binarysearch;

public class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int m = 0;

        while (l <= r) {
            m = (l + r) / 2;

            if (nums[m] < target) {
                l = m + 1;
            } else if (nums[m] > target) {
                r = m - 1;
            } else {
                return m;
            }
        }

        return -1;
    }
}