class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            int curr = nums[mid];
            System.out.println(mid);
            if(curr == target){
                return mid;
            }
            else if(nums[low]<=nums[mid]){
                if(target>=nums[low]&&target<nums[mid]){
                    
                    high = mid-1;
                }
                else {
                    System.out.println(mid);
                    low = mid+1;
                }
            }   
            else{
                if(target<=nums[high]&&target>nums[mid]){
                    
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }         
        }
        return -1;
    }
}
