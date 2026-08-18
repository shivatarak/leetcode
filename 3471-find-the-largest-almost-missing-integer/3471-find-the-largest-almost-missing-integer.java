class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        int max = -1;
        int min = Integer.MAX_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> l = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (j < n) {
            l.add(nums[j]);
            if (j - i + 1 == k) {
                HashSet<Integer> set = new HashSet<>(l);
                for (int num : set) {
                    map.put(num, map.getOrDefault(num, 0) + 1);
                }
                l.remove(Integer.valueOf(nums[i]));
                i++;
            }
            j++;
        }
        for (int a : map.keySet()) {
            if (map.get(a) < min) {
                min = map.get(a);
            }
        }
        if (min != 1) {
            return -1;
        }
        for (int a : map.keySet()) {
            if (map.get(a) == min) {
                max = Math.max(max, a);
            }
        }
        return max;
    }
}