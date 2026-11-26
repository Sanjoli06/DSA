class Solution {
    public boolean canAliceWin(int n) {
           for(int i=10;i>=1;i--){
            if(n<i){
                return i%2==1 ? true :false;
            }
            n-=i;
        }
        return true;
    }
}