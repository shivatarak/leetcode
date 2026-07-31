class Solution {
    public int minimumPushes(String word) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : word.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        List<Integer> freq = new ArrayList<>(map.values());
        Collections.sort(freq, Collections.reverseOrder());
        int ans = 0;
        for (int i = 0; i < freq.size(); i++) {
            ans += freq.get(i) * (i / 8 + 1);
        }
        return ans;
    }
}