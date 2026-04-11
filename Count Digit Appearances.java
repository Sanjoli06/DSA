class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int cnt=0;
        for(int i:nums){
            String s=String.valueOf(i);
            for(char ch :s.toCharArray()){
                if(ch-'0'==digit){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}