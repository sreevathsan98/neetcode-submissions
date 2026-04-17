class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res= new ArrayList<>();
        HashMap<String,ArrayList<String>> hs =new HashMap<>();
        int n = strs.length;
        for(int i=0;i<strs.length;i++){
            int[] c = new int[26];
            for(Character ch:strs[i].toCharArray()){
                c[ch-'a']++;
            }
            String key = Arrays.toString(c);
            if(!hs.containsKey(key)){
                hs.put(key,new ArrayList<String>());
            }
            hs.get(key).add(strs[i]);
        }
        for(String key:hs.keySet()){
            res.add(hs.get(key));
        }
        return res;
    }
}
