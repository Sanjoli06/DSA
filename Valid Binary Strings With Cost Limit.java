class Solution {
     List<String> ans;
    public List<String> generateValidStrings(int n, int k) {
        ans= new ArrayList();
        getAll(n,"",k,0);
        return ans;
    }

    public void getAll(int n,String st,int k,int sum){
        if(sum>k) return ;
        if(st.length()==n){
            ans.add(st);
            return;
        }

        getAll(n,st+'0',k,sum);
        if(st.length()==0 || st.charAt(st.length()-1)=='0')
        getAll(n,st+'1',k,sum+st.length());
    }
}