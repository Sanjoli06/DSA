class Solution {
    public int firstUniqueFreq(int[] nums) {
        int freq=0;
        int val=-1;
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap();
        for(int v:nums){
            map.put(v,map.getOrDefault(v,0)+1);
        }
        int ans=-1;
        LinkedHashMap<Integer,Integer> set=new LinkedHashMap();
        for(int k:map.keySet()){
            int f=map.get(k);
            if(set.containsKey(f)) set.put(f,-1);
            else set.put(f,k);
        }

        for(int k:set.values()){
            if(k!=-1) return k;
        }
        return -1;
    }
}