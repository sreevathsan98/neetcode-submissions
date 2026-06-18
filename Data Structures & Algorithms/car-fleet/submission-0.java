class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        TreeMap<Integer,Double> tm =new TreeMap<>(Collections.reverseOrder());
        int n = position.length;
        for(int i=0;i<n;i++){
            tm.put(position[i], (double)(target-position[i])/speed[i]);
        }
        double curr = 0.0;
        int res =0;
        for(double time : tm.values()){
            if(time>curr){
                curr = time;
                res++;
            }
        }
        return res;
    }
}
