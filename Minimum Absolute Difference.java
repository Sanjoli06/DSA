import java.util.*;
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int diff=Integer.MAX_VALUE;
        List<List<Integer>> ans=new ArrayList();
        for(int i=1;i<arr.length;i++){
            int currdiff=arr[i]-arr[i-1];
            List<Integer> temp=new ArrayList();
            if(currdiff<diff){
                ans=new ArrayList();
                diff=currdiff;
                temp.add(arr[i-1]);
                temp.add(arr[i]);
                ans.add(temp);
            }
            else if(currdiff==diff){
                temp.add(arr[i-1]);
                temp.add(arr[i]);
                ans.add(temp);
            }
        }

        return ans;
    }
}