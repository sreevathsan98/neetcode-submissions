class Solution {
    public boolean isValid(String s) {
        Stack<Character> paraStack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                paraStack.add(s.charAt(i));
            else if(paraStack.isEmpty() || (s.charAt(i) == ')' && paraStack.peek() != '(')|| (s.charAt(i) == '}' && paraStack.peek() != '{') || (s.charAt(i) == ']' && paraStack.peek() != '['))
                return false;
            else
                paraStack.pop();
        }
        if(paraStack.isEmpty()) return true;
        return false;
    }
}