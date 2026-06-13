package com.leetcode.minhtq.easy.findsmallestlettergreaterthantarget;

public class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0;
        int r = letters.length - 1;

        while (l <= r) {
            int m = (l + r) / 2;
            if (letters[m] > target) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }

        return letters[l % letters.length];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] letters = {'x','x','y','y'};
        System.out.println(solution.nextGreatestLetter(letters, 'z'));
    }
}

