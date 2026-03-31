class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans=new ArrayList();
        ans.add(1);
        if(rowIndex==0){
            return ans;
        }
        else if(rowIndex==1){
        ans.add(1);
        return ans;    
        }

        ArrayList<List<Integer>> temp=new ArrayList();
        temp.add(ans);
        for(int i=1;i<=rowIndex;i++){
            List<Integer> prev=temp.get(i-1);
            List<Integer> curr=new ArrayList();
            curr.add(1);
            for(int j=1;j<i;j++){
                curr.add(prev.get(j)+prev.get(j-1));
            }
            curr.add(1);
            temp.add(curr);
        }
        return temp.get(rowIndex);
    }
}