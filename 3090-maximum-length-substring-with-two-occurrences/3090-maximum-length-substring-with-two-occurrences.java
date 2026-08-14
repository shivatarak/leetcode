class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        int i = 0;
        int j = 0;
        int l = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (j < n) {
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            int max = Collections.max(map.values());
            while (map.get(ch) > 2) {
                char left = s.charAt(i);
                map.put(left, map.get(left) - 1);
                if (map.get(left) == 0) {
                    map.remove(left);
                }
                i++;
            }
            l = Math.max(l, j - i + 1);
            j++;
        }
        return l;
    }
}