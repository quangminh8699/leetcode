package com.leetcode.minhtq.medium.countnegativenumbersinasortedmatrix;

public class Solution {
    // O(m×log n)
    public int countNegatives(int[][] grid) {
        int n = grid[0].length;
        int count = 0;

        for (int[] ints : grid) {
            int l = 0;
            int r = n;
            while (l < r) {
                int mid = (l + r) / 2;
                if (ints[mid] < 0) r = mid;
                else l = mid + 1;
            }
            count += n - l;
        }

        return count;
    }

    // O(m + n)
    public int countNegatives2(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int i = 0, j = n - 1;
        int count = 0;

        while (i < m && j >= 0) {
            if (grid[i][j] < 0) {
                count += m - i;  // toàn bộ hàng từ i xuống đều âm tại cột j
                j--;
            } else {
                i++;
            }
        }

        return count;
    }
}
