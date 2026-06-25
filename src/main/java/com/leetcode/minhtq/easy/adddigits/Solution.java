package com.leetcode.minhtq.easy.adddigits;

public class Solution {

    int result = 0;
    public int addDigits(int num) {
        while (num > 0) {
            result += num % 10;

            if (result >= 10) {
                result = (result % 10) + (result / 10);
            }

            num /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.addDigits(999));
    }
}
