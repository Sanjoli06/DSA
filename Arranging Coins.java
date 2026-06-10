class Solution {
    public int arrangeCoins(int n) {
        long low = 1;
        long high = n;
        while(low<high) {
            long mid = low+(high-low+1)/2;
            if(isFeasible(mid, n)) {
                low = mid; //can form stairs so go higher
            } else {
                high = mid-1;
            }
        }
        return (int)low;
    }

    private boolean isFeasible(long candidate, int total) {
        return candidate*(candidate+1)/2<=total;
    }
}