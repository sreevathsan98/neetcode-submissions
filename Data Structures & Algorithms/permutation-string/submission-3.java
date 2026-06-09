class Solution {

    public boolean checkInclusion(String s1, String s2) {
        //s2 is bigger string
        if(s1.length()>s2.length()){
            return false;
        }
        int[] s1Arr = new int[26];
        int[] s2Arr = new int[26];
        for(int i=0;i<s1.length();i++){
            s1Arr[s1.charAt(i)-'a']++;
            s2Arr[s2.charAt(i)-'a']++;
        }
        //optimizing matches
        int count =0;
        for(int i=0;i<26;i++){
            if(s1Arr[i]==s2Arr[i]){
                count++;
            }
        }
        for(int i=0;i<s2.length()-s1.length();i++){
            if(count==26){
                return true;
            }
            int l=s2.charAt(i)-'a';
            int r = s2.charAt(i+s1.length())-'a';
            s2Arr[r]++;
            if(s1Arr[r]==s2Arr[r]){
                count++;
            }
            else if(s1Arr[r]+1==s2Arr[r]){
                count--;
            }
            s2Arr[l]--;
            if(s1Arr[l]==s2Arr[l]){
                count++;
            }
            else if(s1Arr[l]-1==s2Arr[l]){
                count--;
            }
        }
        return count==26;
    }
}
