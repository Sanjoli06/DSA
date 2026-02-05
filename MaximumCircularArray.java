class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        int ts=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            ts+=nums[i];
           max= Math.max(max,sum);
           if(sum<0){
               sum=0;
           }
        }
        int min=Integer.MAX_VALUE;
        sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            min=Math.min(min,sum);
            if(sum>0){
                sum=0;
            }
        }
        if(ts==min){
            return max;
        }
        return Math.max(max,ts-min);
    }
}
