class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        StringBuilder left = new StringBuilder();
        String middle = "";
        for (char i = 'a'; i <='z'; i++) {
            if (map.containsKey(i)) {
                int freq = map.get(i);
                for (int j = 0; j < freq / 2; j++) {
                    left.append(i);
                }
                if (freq % 2 == 1) {
                    middle = String.valueOf(i);
                }
            }
        }
        String last = new StringBuilder(left).reverse().toString();
        return left.toString() + middle + last;

    }
}