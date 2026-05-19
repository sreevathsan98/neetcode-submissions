class Solution {
    public int maxArea(int[] nums) {
        int n = nums.length;
        int res = Integer.MIN_VALUE;
        int start = 0;
        int end = n-1;
        while(start<end){
            res = Math.max(res , Math.min(nums[start],nums[end])*(end-start));
            if(nums[start]<nums[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return res;
    }
}
