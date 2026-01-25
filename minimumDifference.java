class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min=nums[k-1]-nums[0];
        int n=nums.length;
        for(int i=k;i<n;i++){
            min=Math.min(min,nums[i]-nums[i-k+1]);
        }
        return min;
    }
}
