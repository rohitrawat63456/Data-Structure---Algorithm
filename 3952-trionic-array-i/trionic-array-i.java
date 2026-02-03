class Solution {
    public boolean isTrionic(int[] nums) {
        int len = nums.length;
        int i = 1, p = -1, q = -1;
        while (i < len && nums[i] > nums[i - 1]) {
            i++;
        }
        p = i - 1;
        while (i < len && nums[i] < nums[i - 1]) {
            i++;
        }
        q = i - 1;
        while (i < len && nums[i] > nums[i - 1]) {
            i++;
        }
        System.out.println(p+" "+q+" "+i);
        if(p==0 || p==-1 || p==q || q==-1 || q==len-1 || i!=len){
            return false;
        }
        return true;

    }
}