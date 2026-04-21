class Solution {
    public int differenceOfSums(int n, int m) {
        int ans1=0,ans2=0;
        for(int i=1;i<=n;i++){
            if (i%m == 0) {
                ans1+=i;
            } else {
                ans2+=i;
            }
        }
        return ans2-ans1;
    }
}