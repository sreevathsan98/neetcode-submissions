class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int n = nums.length;
        for(int i =0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->b[1]-a[1]);
        for(Integer key:hm.keySet()){
            pq.add(new int[]{key,hm.get(key)});
        }
        int[] res = new int[k];
        for(int i=0;i<k&&!pq.isEmpty();i++){
            res[i]= pq.poll()[0];
        }
        return res;
    }
}
