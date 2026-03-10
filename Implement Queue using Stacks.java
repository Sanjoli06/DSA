class MyQueue {
    Stack<Integer> st;
    public MyQueue() {
        st= new Stack();
    }
    
    public void push(int x) {
        if(st.isEmpty()) st.push(x);
        else insertAtBottom(x);
    }
    
    public int pop() {
        if(st.isEmpty()) return -1;
        else return st.pop();
    }
    
    public int peek() {
         if(st.isEmpty()) return -1;
        return st.peek();
    }
    
    public boolean empty() {
         return st.isEmpty();
    }

    public void insertAtBottom(int val){
        if(st.isEmpty()){
            st.push(val);
            return;
        }
        int top=st.pop();
        insertAtBottom(val);
        st.push(top);
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */