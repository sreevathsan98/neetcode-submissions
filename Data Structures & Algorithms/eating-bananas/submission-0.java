class Solution {
    public boolean canEat(int[] piles , int h , int k){
        int n = piles.length;
        int count =0;
        for(int i=0;i<n;i++){
            count += piles[i]%k==0? piles[i]/k : piles[i]/k+1;
        }
        System.out.println(count);
        return count<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Integer.MAX_VALUE;
        int n = piles.length;
        for(int i =0;i<n;i++){
            high = Math.max(piles[i],high);
        }
        int ans = -1;
        while(low<=high){
            int mid = low+ (high-low)/2;
            if(canEat(piles,h,mid)){
                ans = mid;
                high = mid-1;
            }
            else{
                 low = mid+1;
            }
        }
        return ans;
    }
}
