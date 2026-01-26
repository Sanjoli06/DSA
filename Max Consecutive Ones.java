class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxi=0;
        int i=0;
        int j=0;
        while(j<nums.length){
            if(nums[j]!=1){
                int len=j-i;
                maxi=Math.max(len,maxi);
                i=j+1;
            }
            j++;
        }
        int len=j-i;
        maxi=Math.max(len,maxi);
        return maxi;
    }
}