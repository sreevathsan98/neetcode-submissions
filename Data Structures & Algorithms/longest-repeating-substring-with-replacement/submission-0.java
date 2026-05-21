class Solution {
    public int characterReplacement(String s, int k) {
        int low = 1;
        int high =s.length()+1;
        while(low+1<high){
            int mid = low+ (high-low)/2;
            if(isValidSubstring(s,mid,k)){
                low = mid;
            }
            else{
                high= mid;
            }
        }
        return low;
    }
    public boolean isValidSubstring(String s, int n,int k){
        int[] freqMap = new int[26];
        int maxFreq = 0;
        int start = 0; 
        for(int end=0;end<s.length();end++){
            int c = s.charAt(end)-'A';
            freqMap[c]++;
            if(end-start+1>n){
                freqMap[s.charAt(start)-'A']--;
                start++;
            }
            maxFreq = Math.max(maxFreq,freqMap[c]);
            int windowSize = end-start+1;
            if(windowSize==n&&(windowSize-maxFreq<=k)){
                return true;
            }
        }
        return false;
    }
}
