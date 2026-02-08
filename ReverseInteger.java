class Solution {
    public int reverse(int x) {
        long ans=0;
        boolean flag=false;
        if(x<0){
            x*=(-1);
            flag=true;
        }
        while(x>0){
            int rem=x%10;
            ans=ans*10+rem;
            if(ans<Integer.MIN_VALUE || ans>Integer.MAX_VALUE){
                return 0;
            }
            x/=10;
        }

        if(flag){
            ans*=(-1);
        }
        
        return (int)ans;
    }
}