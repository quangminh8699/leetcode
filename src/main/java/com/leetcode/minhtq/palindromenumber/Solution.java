package com.leetcode.minhtq.palindromenumber;

public class Solution {
    // Time: O(log10(x))
    // Space: O(1)
    public boolean isPalindrome(int x) {
        long reverse = 0;
        int xCopy = x;
        while (x > 0) {
            reverse = (reverse * 10) + x % 10;
            x /= 10;
        }

        return reverse == xCopy;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int x = 1221;
        System.out.println(s.isPalindrome(x));
    }
}
