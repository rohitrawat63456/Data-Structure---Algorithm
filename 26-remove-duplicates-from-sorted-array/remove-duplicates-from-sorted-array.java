class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int n : nums) {
            if (!list.contains(n))
                list.add(n);
        }
        int idx = 0;
        while (idx < list.size()) {
            nums[idx] = list.get(idx++);
        }
        return list.size();
    }
}