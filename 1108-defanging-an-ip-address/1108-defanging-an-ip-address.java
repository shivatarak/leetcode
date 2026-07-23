class Solution {
    public String defangIPaddr(String address) {
        int n = address.length();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char ch = address.charAt(i);
            if (Character.isDigit(ch)) {
                s.append(ch);
                continue;
            }
            s.append('[');
            s.append(ch);
            s.append(']');
        }
        return s.toString();
    }
}