class Solution {
    List<String> ans;
    public List<String> generateParenthesis(int n) {
        ans=new ArrayList();
        sol(n,0,0,"");
        return ans;
    }

    public void sol(int n, int ob, int cb, String temp){
        if(ob+cb==2*n){
            ans.add(temp);
            return;
        }

        if(ob<n){
            sol(n,ob+1,cb,temp+"(");
        }

        if(cb<ob){
            sol(n,ob,cb+1,temp+")");
        }
    }
}