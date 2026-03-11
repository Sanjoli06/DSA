class Solution {
    public boolean isValid(String s) {
        return sol(s);
    }

    public boolean sol(String s){
       Stack<Character> st=new Stack();
       for(char ch:s.toCharArray()){
        if(st.isEmpty() || ch=='(' || ch=='{' || ch=='['){
            st.push(ch);
        }
        else{
            if(!st.isEmpty() && ((st.peek()=='(' && ch==')') || (st.peek()=='{' && ch=='}') || (st.peek()=='[' && ch==']'))){
                st.pop();
            }
            else{
                return false;
            }
        }
       }
       return st.isEmpty();
    }
}