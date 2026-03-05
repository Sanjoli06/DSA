class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res=0;
        int gap=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            int s=i+1;
            int e=nums.length-1;

            while(s<e){
                int sum=nums[i]+nums[s]+nums[e];

                if(sum<target){
                    if(target-sum < gap){
                        gap=target-sum;
                        res=sum;
                    }
                    s++;
                }
                else if(sum>target){
                     if(sum-target < gap){
                        gap=sum-target;
                        res=sum;
                    }
                    e--;
                }
                else{
                    return target;
                }
            }
        }
        return res;
    }
}