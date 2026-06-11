package com.leetcode.minhtq.searchinsertposition;

public class Solution {
    // Time: O(log n)
    // Space: O(1)
    public int searchInsert(int[] nums, int target) {
        int f = 0;                  // first
        int l = nums.length - 1;    // last
        int m = 0;                  // mid

        while (f <= l) {
            m = (f + l) / 2;
            System.out.println("first - mid - last: " + f + " - " + m + " - " + l);
            if (nums[m] > target) {
                l = m - 1;
            } else if (nums[m] < target) {
                f = m + 1;
            } else {
                return m;
            }
        }

        return f;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.searchInsert(new int[]{1, 3, 4}, 2));
    }
}
