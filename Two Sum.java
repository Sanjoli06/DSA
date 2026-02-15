class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        HashMap<Integer,Integer> map=new HashMap();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                int fi=map.get(target-nums[i]);
                ans[0]=fi;
                ans[1]=i;
                break;
            }
            map.put(nums[i],i);
        }
        return ans;
    }
}