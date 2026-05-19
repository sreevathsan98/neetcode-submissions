class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int currMin = prices[0];
        int res = 0;
        int currMax = prices[0];
        for(int i=1;i<n;i++){
            currMin = Math.min(prices[i],currMin);  
            if(prices[i]>currMin){
                res=Math.max(res, prices[i]-currMin);
            }
        }
        return res ;
    }
}
