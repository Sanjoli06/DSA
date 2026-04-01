class Solution {
    public int thirdMax(int[] nums) {
        Long max = Long.MIN_VALUE;
        Long smax = Long.MIN_VALUE;
        Long tmax = Long.MIN_VALUE;

        for (int num : nums) {
            if (num == max || num == smax || num == tmax) continue;

            if (num > max) {
                tmax = smax;
                smax = max;
                max = (long) num;
            } 
            else if (num > smax) {
                tmax = smax;
                smax = (long) num;
            } 
            else if (num > tmax) {
                tmax = (long) num;
            }
        }

        return tmax == Long.MIN_VALUE ? max.intValue() : tmax.intValue();
    }
}