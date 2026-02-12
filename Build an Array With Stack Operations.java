class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans=new ArrayList();
        int i=1;
        int j=0;
        while(i<=n){
            if(j==target.length) break;
            if(target[j]==i){
                 ans.add("Push");
                 j++;
            }
            else{
                ans.add("Push");
                ans.add("Pop");
            }
            i++;
        }
        return ans;
    }
}