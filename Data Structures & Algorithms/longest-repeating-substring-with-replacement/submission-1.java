class Solution {
    public int characterReplacement(String s, int k) {
        int low = 0;
        int high =s.length();
        int ans = 0;
        while(low<=high){
            int mid = low+ (high-low)/2;
            if(isValidSubstring(s,mid,k)){
                ans = mid;
                low = mid+1;
            }
            else{
                high= mid-1;
            }
        }
        return ans;
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
