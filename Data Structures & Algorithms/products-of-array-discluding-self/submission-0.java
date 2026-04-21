class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n =nums.length;
        int[] pre = new int[n];
        int[] post = new int[n];
        int[] res = new int[n];
        pre[0]= nums[0];
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]*nums[i];
        }
        post[n-1] = nums[n-1];
        for(int i=n-1-1;i>0;i--){
            post[i]=post[i+1]*nums[i];
        }
        for(int i=0;i<n;i++){
            if(i==0){
                res[i]=post[i+1];
            }
            else if(i==n-1){
                res[i] = pre[n-2];
            }
            else{
                res[i] = pre[i-1]*post[i+1];
            }
        }
        return res;
    }
}  
