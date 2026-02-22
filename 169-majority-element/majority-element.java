class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            int f = map.containsKey(n) ? map.get(n) : 0;
            map.put(n, f + 1);
        }
        int n = nums.length;
        int ans = 0;
        for (int key : map.keySet()) {
            if (map.get(key) > n / 2) {
                ans = key;
                break;
            }
        }
        return ans;
    }
}