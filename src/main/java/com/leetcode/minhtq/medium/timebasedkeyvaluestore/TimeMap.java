package com.leetcode.minhtq.medium.timebasedkeyvaluestore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeMap {
    // Gọn hơn: dùng 2 list riêng cho timestamp và value
    private Map<String, List<Integer>> timestamps;
    private Map<String, List<String>> vals;

    public TimeMap() {
        timestamps = new HashMap<>();
        vals = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        timestamps.computeIfAbsent(key, k -> new ArrayList<>()).add(timestamp);
        vals.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
    }

    public String get(String key, int timestamp) {
        if (!timestamps.containsKey(key)) return "";

        List<Integer> ts = timestamps.get(key);
        // Binary search: tìm index lớn nhất có ts[index] <= timestamp
        int lo = 0, hi = ts.size() - 1, ans = -1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (ts.get(mid) <= timestamp) {
                ans = mid;   // candidate, thử tìm lớn hơn về phía phải
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return ans == -1 ? "" : vals.get(key).get(ans);
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */