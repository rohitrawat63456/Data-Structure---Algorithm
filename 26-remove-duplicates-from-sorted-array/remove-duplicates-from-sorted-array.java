class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int prev = nums[0];
        for (int i = 1; i < len; i++) {
            int c = nums[i];
            if (nums[i] == prev) {
                nums[i] = -101;
            }
            prev = c;
        }
        //System.out.println(Arrays.toString(nums));
        int idx = 0;
        for (int n : nums) {
            if (n != -101) {
                nums[idx++] = n;
            }
        }
        return idx;
    }
}