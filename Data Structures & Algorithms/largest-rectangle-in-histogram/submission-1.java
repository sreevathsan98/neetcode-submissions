class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<int[]> s = new Stack<>();
        int n = heights.length;
        int res = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int curr = heights[i];
            int start = i;
            while(!s.isEmpty()&&s.peek()[1]>=curr){
                int[] temp = s.pop();
                res = Math.max(res, (i-temp[0])*temp[1]);
                start = temp[0];
            }
            s.push(new int[]{start,curr});
        }
        while(!s.isEmpty()){
            int[] temp = s.pop();
            res = Math.max(res,(n-temp[0])*temp[1]);
        }
        return res;
    }
}
