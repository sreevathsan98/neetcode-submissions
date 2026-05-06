class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        HashSet<Integer> hs =new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            hs.add(nums[i]);
        }
        int maxCount =0;
        for(int i=0;i<n;i++){
            int curr = nums[i];
            int currCount=0;
            while(hs.contains(curr)){
                curr++;
                currCount++;
            }
            maxCount=Math.max(maxCount,currCount);
        }
        return maxCount;
    }
}
