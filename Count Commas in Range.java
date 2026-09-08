class Solution {
    public int countCommas(int n) {
        if(n<1000){
            return 0;
        }
        return n - 999;
    }
}


//// OR ///// 

class Solution {
    public int countCommas(int n) {
        String num=String.valueOf(n);
        int len=num.length();
        if(len<4) return 0;
        int i=1;
        int cnt=0;
        while(i<len){
            if(i%3==0) cnt++;
            i++;
        }
        return cnt*(n-1000+1);
    }
}
