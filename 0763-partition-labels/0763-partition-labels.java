class Solution {
    public List<Integer> partitionLabels(String s) {
        int n = s.length();
        ArrayList<Integer> al = new ArrayList<>();
        int[] last = new int[26];
        for (int i = 0; i < n; i++) {
            last[s.charAt(i) - 'a'] = i;
        }
        int start = 0;
        int end = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            end = Math.max(end, last[ch - 'a']);
            if (i == end) {
                int count = end - start + 1;
                al.add(count);
                start = i + 1;
            }
        }
        return al;
    }
}