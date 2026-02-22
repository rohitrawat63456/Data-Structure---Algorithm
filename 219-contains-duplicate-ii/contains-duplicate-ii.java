class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int left = 0;
        for(int right =0;right<nums.length;right++){
            if(right-left > k){
                map.remove(nums[left]);
                left++;
            }
            if(map.containsKey(nums[right])){
                return true;
            }
            map.put(nums[right],right);
        }
        return false;
    }
}