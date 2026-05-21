class Solution {
    public boolean isPermute(String a,String b){
        int[] c = new int[26];
        for(int i=0;i<a.length();i++){
            c[a.charAt(i)-'a']++;
        }
        for(int i=0;i<b.length();i++){
            c[b.charAt(i)-'a']--;
            if(c[b.charAt(i)-'a']<0){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if(n1>n2){
            return false;
        }
        for(int i=0;i<=n2-n1;i++){
            if(isPermute(s1,s2.substring(i,i+n1))){
                return true;
            }
        }
        return false;
    }
}
