package com.leetcode.minhtq.easy.longestcommonprefix;

public class Solution {
    // Time: O(n * m)
    // Space: O(m)
    public String longestCommonPrefix1(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        StringBuilder prefix = new StringBuilder();

        int j = 0;
        int i = 0;
        String firstElement = strs[0];
        while (j < firstElement.length()) {
            if (j == strs[i].length()) {
                break;
            }

            if (strs[i].charAt(j) != firstElement.charAt(j)) {
                break;
            }

            if (i == strs.length - 1) {
                prefix.append(firstElement.charAt(j));
                i = 0;
                j += 1;
                continue;
            }

            i += 1;
        }

        return prefix.toString();
    }

    // Time: O(n * m)
    // Space: O(m)
    public String longestCommonPrefix2(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        // Start with the first string as the prefix
        String prefix = strs[0];

        // Compare prefix with each string
        for (int idx = 1; idx < strs.length; idx++) {
            String s = strs[idx];
            // Reduce prefix until it matches the start of s
            while (!s.startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1); // Remove last character
                if (prefix.equals("")) {
                    return "";
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String[] x = {"flower", "flow", "flight"};

        long startTime1 = System.nanoTime();
        String res1 = s.longestCommonPrefix1(x);
        System.out.println("res1: " + res1 + ", executed in: " + (System.nanoTime() - startTime1) / 1e9);

        long startTime2 = System.nanoTime();
        String res2 = s.longestCommonPrefix2(x);
        System.out.println("res2: " + res2 + ", executed in: " + (System.nanoTime() - startTime2) / 1e9);
    }
}
