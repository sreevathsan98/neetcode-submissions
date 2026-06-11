class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int n = nums.length;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<k;i++){
            while(!dq.isEmpty()&&nums[dq.peekLast()]<=nums[i]){
                dq.pollLast();
            }
            dq.offer(i);
        }
        al.add(nums[dq.peekFirst()]);
        for(int i=k;i<n;i++){
            if(dq.peekFirst()==i-k){
                dq.pollFirst();
            }
            while(!dq.isEmpty()&&nums[dq.peekLast()]<=nums[i]){
                dq.pollLast();
            }
            dq.offer(i);
            al.add(nums[dq.peekFirst()]);
        }
        return al.stream().mapToInt(i->i).toArray();
    }
}
