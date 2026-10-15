class Solution {
    public char kthCharacter(int k) { 
        StringBuilder gen=new StringBuilder("");
        String s="a";

        return sol(k,gen,s);
    }

    public char sol(int k,StringBuilder gen,String s){
        if(s.length()>=k){
            return s.charAt(k-1);
        }
        StringBuilder st=new StringBuilder();
        for(char ch:s.toCharArray()){
           st.append((char)(ch + 1));
        }
        return sol(k,st,s+st);
    }
}