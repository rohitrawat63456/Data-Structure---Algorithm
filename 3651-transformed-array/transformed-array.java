class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int len = nums.length;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            int idx = i + nums[i];
            idx = idx % len;
            if (idx < 0) {
                idx = len + idx;
            }
            arr[i] = nums[idx];
        }
        return arr;
    }
}