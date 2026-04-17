class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hs = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
           int diff = target-nums[i];
           if(hs.containsKey(diff)){
            return new int[]{hs.get(diff),i};
           }
           hs.put(nums[i],i);
        }
        return new int[]{};
    }
}
