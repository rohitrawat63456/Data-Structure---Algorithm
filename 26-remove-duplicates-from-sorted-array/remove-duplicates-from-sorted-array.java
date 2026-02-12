class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int n : nums) {
            if (!list.contains(n)) {
                list.add(n);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        return list.size();
    }
}