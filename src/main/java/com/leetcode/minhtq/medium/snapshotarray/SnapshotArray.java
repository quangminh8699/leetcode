package com.leetcode.minhtq.medium.snapshotarray;

import java.util.TreeMap;

public class SnapshotArray {
    TreeMap<Integer, Integer>[] history;
    int snapId = 0;

    public SnapshotArray(int length) {
        history = new TreeMap[length];
        for (int i = 0; i < length; i++) {
            history[i] = new TreeMap<>();
            history[i].put(0, 0);
        }
    }

    public void set(int index, int val) {
        history[index].put(snapId, val);
    }

    public int snap() {
        return snapId++;
    }

    public int get(int index, int snap_id) {
        return history[index].get(history[index].floorKey(snap_id));
    }
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */