
class Solution {
    public int longestValidParentheses(String s) {
        int k = 0;
        int j = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                k++;
            } else {
                j++;
            }
            if (k == j) {
                max = Math.max(max, 2 * j);
            } else if (j > k) {
                k = 0;
                j = 0;
            }
        }
        k = 0;
        j = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') {
                k++;
            } else {
                j++;
            }
            if (k == j) {
                max = Math.max(max, 2 * k);
            } else if (k > j) {
                k = 0;
                j = 0;
            }
        }
        return max;
    }
}
