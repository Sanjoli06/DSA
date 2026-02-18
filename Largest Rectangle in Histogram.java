class Solution {
    public int largestRectangleArea(int[] heights) {
        int ans=Integer.MIN_VALUE;
        Stack<Integer> st=new Stack();
        int n=heights.length;
        int[] l=new int[n];
        l[0]=-1;
        st.push(0);

        for(int i=1;i<n;i++){
            while(!st.isEmpty() && heights[i]<=heights[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                l[i]=-1;
            }
            else{
                l[i]=st.peek();
            }
            st.push(i);
        }

        int[] r=new int[n];
        r[n-1]=n;
        st=new Stack();
        st.push(n-1);

        for(int i=n-2;i>=0;i--){
            while(!st.isEmpty() && heights[i]<=heights[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                r[i]=n;
            }
            else{
                r[i]=st.peek();
            }
            st.push(i);
        }

        for(int i=0;i<n;i++){
            int width=r[i]-l[i]-1;
            int area=width*heights[i];
            ans=Math.max(ans,area);
        }
        return ans;
    }
}