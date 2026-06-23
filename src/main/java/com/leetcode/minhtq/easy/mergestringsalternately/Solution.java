package com.leetcode.minhtq.easy.mergestringsalternately;

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        int longest = Math.max(word1.length(), word2.length());

        for (int i = 0; i < longest; i++) {
            if (i < word1.length()) {
                sb.append(word1.charAt(i));
            }

            if (i < word2.length()) {
                sb.append(word2.charAt(i));
            }
        }

        return sb.toString();
    }
}
