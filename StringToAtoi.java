class Solution {
    public int myAtoi(String s) {
        // recursive approach

        if(s.length()==0) return 0;

        s=s.trim();
        if(s.isEmpty()) return 0;

        boolean isNeg=false;
        int idx=0;
        if(s.charAt(0)=='-'){
            isNeg=true;
            idx++;
        }
        else if(s.charAt(0)=='+'){
            idx++;
        }

        return sol(s,idx,isNeg,0);
    }

    public int sol(String s, int idx, boolean isNeg, int curr){
        if(idx>=s.length()) return isNeg? -curr : curr;

        char ch=s.charAt(idx);
        if(ch<'0' || ch>'9')  return isNeg? -curr : curr;

        int dig=ch-'0';

        // we want 
        // current * 10 + digit <= Integer.MAX_VALUE

        // so rearranging we get 
        // curr> (Integer.MAX_VALUE-dig)/10

        if(curr> (Integer.MAX_VALUE-dig)/10)  return isNeg? -Integer.MIN_VALUE : Integer.MAX_VALUE;

        return sol(s,idx+1,isNeg,curr*10+dig);

    }
}