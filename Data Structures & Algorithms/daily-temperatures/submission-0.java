class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<int[]> stack = new Stack<>();
        int[] result=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty()&&stack.peek()[0]<=temperatures[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                result[i]=0;
            }
            else{
                result[i] = stack.peek()[1]-i;
            }
            stack.push(new int[]{temperatures[i],i});
        }
        return result;
    }
}
