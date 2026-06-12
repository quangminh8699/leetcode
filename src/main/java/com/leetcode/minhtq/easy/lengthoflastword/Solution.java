package com.leetcode.minhtq.easy.lengthoflastword;

public class Solution {
    // Time: O(n)
    // Space: O(n)
    public int lengthOfLastWord1(String s) {
        String[] parts = s.trim().split("\\s+");
        return parts[parts.length - 1].length();
    }

    // Time: O(n)
    // Space: O(n)
    public Integer lengthOfLastWord2(String s) {
        int fl = 0;
        String[] n = s.split(" ");
        String ans = "";
        for (int i = n.length - 1; i >= 0; i--) {
            if (!n[i].equals("")) {
                ans = n[i];
                fl = 1;
                break;
            }
        }
        if (fl == 1) {
            return ans.length();
        }
        return null;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        long startTime1 = System.nanoTime();
        int res1 = s.lengthOfLastWord1(" Hello World ");
        System.out.println("res1: " + res1 + ", executed in: " + (System.nanoTime() - startTime1) / 1e9);

        long startTime2 = System.nanoTime();
        Integer res2 = s.lengthOfLastWord2(" Hello World ");
        System.out.println("res2: " + res2 + ", executed in: " + (System.nanoTime() - startTime2) / 1e9);
    }
}
