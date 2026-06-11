package com.leetcode.minhtq.addtwonumbers;

class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); // sentinel node, tránh check null head
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            int sum = val1 + val2 + carry;
            carry = sum / 10;
            int digit = sum % 10;

            current.next = new ListNode(digit);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummy.next;
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
        // Ví dụ: 342 + 465 = 807  ->  [2,4,3] + [5,6,4] = [7,0,8]
        ListNode l1 = buildList(new int[]{2, 4, 3});
        ListNode l2 = buildList(new int[]{5, 6, 4});
        ListNode result = s.addTwoNumbers(l1, l2);
        printList(result);
    }
}

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
