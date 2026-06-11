package com.leetcode.minhtq.removeelement;

import java.util.Arrays;

public class Solution {
    // Time: O(n)
    // Space: O(1)
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k += 1;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int[] expectedNums = {2, 2};
        int k = s.removeElement(nums, val);
        assert k == expectedNums.length;
        int[] firstK = Arrays.copyOfRange(nums, 0, k);
        Arrays.sort(firstK);
        for (int i = 0; i < k; i++) {
            assert firstK[i] == expectedNums[i];
        }

        System.out.println("Success !");
    }
}
