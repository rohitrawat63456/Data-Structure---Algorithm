class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            int b = target - a;
            if (map.containsKey(b)) {
                arr[0] = i;
                arr[1] = map.get(b);
                break;
            }else{
                map.put(a,i);
            }
        }
        return arr;
    }
}