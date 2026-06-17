class MinStack {
    Stack<Integer> stack ;
    Stack<int[]> minStack ;
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        if(minStack.isEmpty()||val<minStack.peek()[0]){
            minStack.push(new int[]{val,1});
        }
        else if(val==minStack.peek()[0]){
            minStack.peek()[1]++;
        }
        stack.push(val);
    }
    
    public void pop() {
        if(stack.isEmpty()) return;
if (stack.peek().equals(minStack.peek()[0])) {
    minStack.peek()[1]--;
}
if(minStack.peek()[1]==0){
    minStack.pop();
}
stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek()[0];
    }
}
