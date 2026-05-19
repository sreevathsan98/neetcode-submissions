class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int n = s.length();
        int start=0;
        int end =0;
        int res =0;
        while(end<n){
            char c = s.charAt(end);
            while(start<end&&hs.contains(c)){
                hs.remove(s.charAt(start));
                start++;
            }
            hs.add(c);
            res = Math.max(res,hs.size());  
            end++;
        }
        return res;
    }
}
