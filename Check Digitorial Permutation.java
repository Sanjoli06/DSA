class Solution {
    public boolean isDigitorialPermutation(int n) {
        int sum=0;
        int[] fact=new int[10];
        fact[0]=1;
        for(int i=1;i<=9;i++){
            fact[i]=fact[i-1]*i;
        }

        int temp=n;
        while(temp!=0){
            int d=temp%10;
            sum+=fact[d];
            temp/=10;
        }
        if(sum==n) return true;
        return isPerm(sum,n);
    }

    public boolean isPerm(int sum,int n){
        int[] f=new int[10];
        int temp=n;
        while(sum!=0){
            f[sum%10]++;
            sum/=10;
        }
        while(temp!=0){
            f[temp%10]--;
            temp/=10;
        }

        for(int fr:f){
            if(fr!=0) return false;
        }
        return true;
    }
}