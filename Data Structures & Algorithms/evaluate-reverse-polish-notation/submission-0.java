class Solution {
    public int compute(int val1,int val2,String token){
        switch(token){
            case "+" : return val1+val2;
            case "-" : return val1-val2;
            case "*" : return val1*val2;
            case "/" : return val1/val2;
        }
        return 0;
    }
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<n;i++){
            if(tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("*")||
            tokens[i].equals("/")){
                Integer val2 = s.pop();
                Integer val1 = s.pop();
                s.push(compute(val1,val2,tokens[i]));
            }
            else{
                s.push(Integer.parseInt(tokens[i]));
            }
        }    
        return s.pop();
    }
}
