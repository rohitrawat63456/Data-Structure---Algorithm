class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        // int prev = nums[0];
        int idx = 1;
        for (int i = 1; i < len; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[idx++] = nums[i];
            }
        }
        return idx;
    }
}