class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        int i = 1;
        while (i <= nums.length) {
            if (!set.contains(i))
                list.add(i);
            i++;
        }
        return list;
    }
}