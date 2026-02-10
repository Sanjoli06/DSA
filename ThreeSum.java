class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i>0 && nums[i-1]==nums[i]) continue;
            int s=i+1;
            int e=n-1;
            while(s<e){
                int sum=nums[s]+nums[e]+nums[i];
                if(sum==0){
                    List<Integer> temp=new ArrayList();
                    temp.add(nums[s]);
                    temp.add(nums[e]);
                    temp.add(nums[i]);
                    ans.add(temp);

                    while(s<e && nums[s]==nums[s+1]) s++;
                    while(e>s && nums[e]==nums[e-1]) e--;
                    s++;
                    e--;
                }
                else if(sum<0){
                    s++;
                }
                else{
                    e--;
                }
            }
        }
            return ans;
    }
}