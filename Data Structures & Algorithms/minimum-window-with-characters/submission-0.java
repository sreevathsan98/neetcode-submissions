class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> sMap = new HashMap<>();
        HashMap<Character,Integer> tMap = new HashMap<>();
        for(int i=0;i<t.length();i++){
            tMap.put(t.charAt(i),tMap.getOrDefault(t.charAt(i),0)+1);
        }
        int count = tMap.size();
        int matches =0;
        int res = Integer.MAX_VALUE;
        String resStr="";
        int start=0;
        for(int end=0;end<s.length();end++){
            char curr = s.charAt(end);
            sMap.put(curr,sMap.getOrDefault(curr,0)+1);
            if(sMap.get(curr)==tMap.get(curr)){
                matches++;
            }
            while(start<end){
                char startChar = s.charAt(start);
                if(!tMap.containsKey(startChar)||sMap.get(startChar)-1>=tMap.get(startChar)){
                    sMap.put(startChar, sMap.getOrDefault(startChar,0)-1);
                    start++;
                }
                else{
                    break;
                }
            }
            if(matches==count&&(end-start+1)<res){
                res =end-start+1;
                resStr = s.substring(start,end+1);
            }
        }
        return resStr;
    }
}
