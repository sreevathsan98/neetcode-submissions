public class Solution {
    public int trap(int[] height) {
      int n =height.length;
      if(n==0){
        return 0;
      }
      int l = 0;
      int r = n-1;
      int res = 0;
      int lmax = -1;
      int rmax = -1;
      while(l<r){
        if(height[l]<height[r]){
            lmax = Math.max(lmax,height[l]);
            res+= lmax-height[l];
            l++;
        }
        else{
            rmax = Math.max(rmax,height[r]);
            res+= rmax-height[r];
            r--;
        }
      }
      return res;
    }
}