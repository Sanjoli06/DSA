class Solution {
    public int scoreDifference(int[] nums) {
        int pl1=0;
        int pl2=0;
        boolean firstActive=true;

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                firstActive=!firstActive;
            }
            if((i+1)%6==0){
                firstActive=!firstActive;
            }

            if(firstActive){
                pl1+=nums[i];
            }
            else{
                pl2+=nums[i];
            }
        }
        return pl1-pl2;
    }
}