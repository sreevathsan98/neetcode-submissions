class Solution {
    public boolean checkChar(char c){
        if(c>='a'&&c<='z'){
            return true;
        }
        else if(c>='A'&&c<='Z'){
            return true;
        }
        else if(c>='0'&&c<='9'){
            return true;
        }
        return false ;
    }
    public boolean isPalindrome(String s) {
        int n = s.length();
        for(int i=0,j=n-1;i<j;i++,j--){
        while(i<j&&!checkChar(s.charAt(i))){
            i++;
        }
        while(j>i&&!checkChar(s.charAt(j))){
            j--;
        }
        if(!(s.charAt(i)+"").toLowerCase().equals((s.charAt(j)+"").toLowerCase())){
            return false;
        }
    
    }
        return true;
        }
}
