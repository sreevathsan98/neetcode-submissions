class Solution {
    public int characterReplacement(String s, int k) {
        int[] freqMap = new int[26];
        int res = 0;
        int start =0;
        int n =s.length();
        int maxFreq = 0;
        for(int end =0;end<n;end++){
            freqMap[s.charAt(end)-'A']++;
            maxFreq = Math.max(maxFreq,freqMap[s.charAt(end)-'A']);
            if(end-start+1 - maxFreq >k){
                freqMap[s.charAt(start)-'A']--;
                start++;
            }
            res = end-start+1;
            //}
        }
        return res;
    }
}
