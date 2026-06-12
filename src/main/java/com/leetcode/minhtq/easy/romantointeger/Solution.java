package com.leetcode.minhtq.easy.romantointeger;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    // Time: O(n)
    // Space: O(1)
    public int romanToInt(String s) {
        Map<Character, Integer> m = new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        int result = 0;
        int idx = 0;
        while (idx < s.length()) {
            if (idx + 1 < s.length() && m.get(s.charAt(idx)) < m.get(s.charAt(idx + 1))) {
                result = result + m.get(s.charAt(idx + 1)) - m.get(s.charAt(idx));
                idx += 2;
            } else {
                result = result + m.get(s.charAt(idx));
                idx += 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.romanToInt("MCMXCIV"));
    }
}
