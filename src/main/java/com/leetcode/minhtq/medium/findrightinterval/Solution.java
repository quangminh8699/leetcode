package com.leetcode.minhtq.medium.findrightinterval;

import com.google.gson.Gson;

import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int m = intervals.length;
        int[] result = new int[m];

        // Bước 1: map start -> index gốc
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < m; i++) {
            map.put(intervals[i][0], i);
        }

        // Bước 2: với mỗi interval, tìm start nhỏ nhất >= end[i]
        for (int i = 0; i < m; i++) {
            int end = intervals[i][1];
            Map.Entry<Integer, Integer> entry = map.ceilingEntry(end);
            result[i] = (entry == null) ? -1 : entry.getValue();
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(new Gson().toJson(solution.findRightInterval(new int[][]{{1, 2}, {3, 4}})));
    }
}