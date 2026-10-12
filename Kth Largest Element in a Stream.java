class KthLargest {
    PriorityQueue<Integer> pq;
    int K;
    public KthLargest(int k, int[] nums) {
        pq=new PriorityQueue();
        K=k;
        for(int i=0;i<nums.length;i++){
            add(nums[i]);
        }
    }
  
    public int add(int val) {
        if(pq.size()<K) pq.add(val);
        else if(val>pq.peek()){
            pq.poll();
            pq.add(val);
        }
        return pq.peek();
    }
}