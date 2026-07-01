class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int min =Integer.MAX_VALUE;
        while(low<=high){
            int mid = low+ (high-low)/2;
            if(nums[mid]<=nums[high]){
                min = Math.min(nums[mid],min);
                high = mid -1 ; 
            }
            else{
                low = mid+1;
            }
        }
        return min;
    }
}
