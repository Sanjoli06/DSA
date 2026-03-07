class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<n;j++){
                if(j!=i+1 && nums[j]==nums[j-1]) continue;
                int s=j+1;
                int e=n-1;
                while(s<e){
                    long sum=(long)nums[i]+nums[j]+nums[s]+nums[e];
                    if(sum==target){
                       List<Integer> temp=new ArrayList();
                       temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[s]);
                        temp.add(nums[e]);
                        ans.add(new ArrayList(temp));
                       
                        while(s<e && nums[s]==nums[s+1]) s++;
                        while(e>s && nums[e]==nums[e-1]) e--;
                         s++;
                        e--;
                    }
                    else if(sum<target){
                        s++;
                    }
                    else{
                        e--;
                    }
                }
            }
        }
        return ans;
    }
}