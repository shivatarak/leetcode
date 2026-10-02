
class Solution {
    List<String> l = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        StringBuilder sb = new StringBuilder();
        solve(sb, n, 0, 0);
        return l;
    }

    void solve(StringBuilder sb, int n, int f, int b) {
        if (sb.length() == 2 * n) {
            l.add(sb.toString());
            return;
        }

        if (f < n) {
            sb.append('(');
            solve(sb, n, f + 1, b);
            sb.deleteCharAt(sb.length() - 1);
        }

        if (b < f) {
            sb.append(')');
            solve(sb, n, f, b + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
