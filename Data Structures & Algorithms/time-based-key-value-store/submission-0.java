class Pair{
    String val;
    int timeStamp;
    public Pair(String val,int timeStamp){
        this.val = val;
        this.timeStamp = timeStamp;
    }
}
class TimeMap {
    HashMap<String,ArrayList<Pair>> hm;
    public TimeMap() {
        hm = new HashMap<>();
    }
    public void set(String key, String value, int timestamp) {
        if(!hm.containsKey(key)){
            hm.put(key, new ArrayList<Pair>());
        }
        hm.get(key).add(new Pair(value,timestamp));
    }
    
    public String get(String key, int timestamp) {
        Pair pair = getTimeStamp(hm.get(key),timestamp);
        return pair!=null?pair.val:"";
    }
    public Pair getTimeStamp(ArrayList<Pair> pairs,int target){
        if(pairs==null){
            return null;
        }
        int size = pairs.size();
        int low = 0;
        int high = size-1;
        Pair ans = null;
        while(low<=high){
            int mid = low+ (high-low)/2;
            if(pairs.get(mid).timeStamp<=target){
                ans = pairs.get(mid);
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */