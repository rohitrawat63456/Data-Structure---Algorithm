class NumArray {
    int[] nums;
    int[] prefixSum;

    public NumArray(int[] nums) {
        this.nums = nums;
        this.prefixSum = calcPrefixSum();
    }

    public int[] calcPrefixSum() {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        return prefix;
    }

    public int sumRange(int left, int right) {
        int prev = left == 0 ? 0 : prefixSum[left - 1];
        return prefixSum[right] - prev;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */