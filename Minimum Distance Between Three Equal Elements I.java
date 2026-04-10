class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap();

        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],new ArrayList());
            }
            map.get(nums[i]).add(i);
        } 

        int ans=Integer.MAX_VALUE;

        for(ArrayList<Integer> l:map.values()){
            if(l.size()<3) continue;

            for(int i=0;i+2<l.size();i++){
                int d=2*(l.get(i+2)-l.get(i));
                ans=Math.min(ans,d);
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}