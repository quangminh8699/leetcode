public class Solution {
    // Time: O(n)
    // Space: O(n)
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;
                return digits;
            }

            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        // các phần tử còn lại đã là 0 (mặc định của mảng int)
        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] res = s.plusOne(new int[]{9, 9, 9});
        System.out.println(java.util.Arrays.toString(res));
    }
}
