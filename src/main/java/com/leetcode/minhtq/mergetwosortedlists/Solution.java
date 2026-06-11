package com.leetcode.minhtq.mergetwosortedlists;

public class Solution {
    // Time: O(n + m)
    // Space: O(n + m)  (recursion stack)
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    // Hàm tạo list từ mảng (ngoài class)
    static ListNode buildList(int[] arr) {
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        for (int x : arr) {
            current.next = new ListNode(x);
            current = current.next;
        }
        return dummy.next;
    }

    // Hàm in LinkedList (ngoài class)
    static void printList(ListNode node) {
        StringBuilder sb = new StringBuilder();
        while (node != null) {
            sb.append(node.val).append(" -> ");
            node = node.next;
        }
        sb.append("None");
        System.out.println(sb);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        ListNode l1 = buildList(new int[]{1, 2, 4});
        ListNode l2 = buildList(new int[]{1, 3, 4});
        ListNode result = s.mergeTwoLists(l1, l2);
        printList(result);
    }
}

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
