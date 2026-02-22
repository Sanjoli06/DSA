class Solution {
    public String maximumXor(String s, String t) {
        int i=0;
        int cnt1=0;
        int cnt0=0;
        for(int j=0;j<t.length();j++){
            if(t.charAt(j)=='0')cnt0++;
            else cnt1++;
        }
        StringBuilder temp=new StringBuilder();
        
        while(i<s.length()){
            if(s.charAt(i)=='0'){
                if(cnt1>0){
                    temp.append("1");
                    cnt1--;
                }
                else{
                    temp.append("0");
                    cnt0--;
                }
            }
            else{
                if(cnt0>0){
                    temp.append("0");
                    cnt0--;
                }
                else{
                    temp.append("1");
                    cnt1--;
                }
            }
            i++;
        }
        StringBuilder ans = new StringBuilder();

    for(int k = 0; k < s.length(); k++){
        if(s.charAt(k) == temp.charAt(k))
            ans.append('0');
        else
            ans.append('1');
    }

    return ans.toString();
    }
}