class Solution {
    public int numSteps(String s) {
        int cnt=0,cnt2=0,n=s.length();
        for(int i=n-1;i>0;i--){
            if((s.charAt(i) & 1)+cnt2==1){
                cnt+=2;
                cnt2=1;
            }
            else{
                cnt+=1;
            }
        }
        return cnt+cnt2;
    }
}