class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] c = new int[26];
        for(Character ch : s.toCharArray()){
            c[ch-'a']++;
        }
        for(Character ch:t.toCharArray()){
            c[ch-'a']--;
            if(c[ch-'a']<0){
                return false;
            }
        }
        return true;
    }
}
