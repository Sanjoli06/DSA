class Solution {
    public boolean hasAlternatingBits(int n) {
        int l=n%2;
        n=n/2;

        while(n!=0){
            int d=n%2;
            if(d==l) return false;
            l=d;
            n/=2;
        }
        return true;
    }
}