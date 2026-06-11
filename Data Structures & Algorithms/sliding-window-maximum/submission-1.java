class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int n = nums.length;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<k;i++){
            while(!dq.isEmpty()&&nums[dq.peekLast()]<=nums[i]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        al.add(nums[dq.getFirst()]);
        for(int i=k;i<n;i++){
            if(dq.getFirst()==i-k){
                dq.removeFirst();
            }
            while(!dq.isEmpty()&&nums[dq.peekLast()]<=nums[i]){
                dq.removeLast();
            }
            dq.addLast(i);
            al.add(nums[dq.getFirst()]);
        }
        return al.stream().mapToInt(i->i).toArray();
    }
}
