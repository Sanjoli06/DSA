class Solution {
    public int sumCounts(List<Integer> nums) {
        int ans=0;
        int i=0;
        int n=nums.size();
        for(;i<n;i++){
            HashSet<Integer> set=new HashSet();
            int j;
            for(j=i;j<n;j++){
                set.add(nums.get(j));
                ans= ans + (int)Math.pow(set.size(),2);
            }
        }
        return ans;
    }
}