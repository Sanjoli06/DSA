class Solution {
    public String digitSum(String s, int k) {
       String ans=find(s,k);
       return ans;
    }

    public String find(String s, int k){
        if(s.length()<=k) return s;
        StringBuilder st=new StringBuilder();

        int sum=0;
        for(int i=1;i<=s.length();i++){
            if(i%k==0){
                sum+=s.charAt(i-1)-'0';
                st.append(Integer.toString(sum));
                sum=0;
            }
            else
            sum+=s.charAt(i-1)-'0';
        }

        if(s.length()%k!=0){
            st.append(Integer.toString(sum));
        }

        return find(st.toString(),k);

    }
}