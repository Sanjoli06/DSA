class Solution {
    public boolean validMountainArray(int[] arr) {
        boolean ans=false;
        int bp=-1;
        int idx=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]) idx++;
            else if(arr[i]==arr[i+1]) return false;
            else{
                bp=i;
                break;
            }
        }
        if(bp==-1 || idx==0) return false;
        for(int i=bp+1;i<arr.length-1;i++){
             if(arr[i]>arr[i+1]) continue;
            else return false;
        }
        return true;
    }
}