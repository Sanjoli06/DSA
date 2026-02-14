class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack();
        int n=tokens.length;
        for(int i=0;i<n;i++){
            String s=tokens[i];
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                int val1=st.pop();
                int val2=st.pop();
                int v=op(val1,val2,s);
                st.push(v);
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop(); 
    }

    public int op(int v1, int v2, String op){
        if(op.equals("+")){
            return v1+v2;
        }
        else if(op.equals("-")){
            return v2-v1;
        }
        else if(op.equals("*")){
            return v2*v1;
        }
        else{
            return v2/v1;
        }
    }
}