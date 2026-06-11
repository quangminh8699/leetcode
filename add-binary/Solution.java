public class Solution {
    // Time: O(max(len(a), len(b)))
    // Space: O(max(len(a), len(b)))
    public String addBinary(String a, String b) {
        StringBuilder s = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            if (i >= 0) {
                carry += a.charAt(i) - '0';
                i -= 1;
            }
            if (j >= 0) {
                carry += b.charAt(j) - '0';
                j -= 1;
            }
            s.append(carry % 2);
            carry /= 2;
        }

        return s.reverse().toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.addBinary("10", "01"));
    }
}
