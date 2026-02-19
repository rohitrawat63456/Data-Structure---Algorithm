class NumArray {
    int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }
    }

    // public void calcPrefixSum() {
    //     //prefix[0] = nums[0];
    //     for (int i = 1; i < nums.length; i++) {
    //         nums[i] = nums[i - 1] + nums[i];
    //     }
    //     System.out.println(Arrays.toString(arr));
    //     //return prefix;
    // }

    public int sumRange(int left, int right) {
        int prev = left == 0 ? 0 : nums[left - 1];
        return nums[right] - prev;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */