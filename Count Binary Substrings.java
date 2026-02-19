class Solution {
    public int countBinarySubstrings(String s) {
        int cnt=1;
        int p=0;
        int ans=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)==s.charAt(i)){
                cnt++;
            }
            else{
                ans+=Math.min(p,cnt);
                p=cnt;
                cnt=1;
            }
        }
        ans+=Math.min(cnt,p);
        return ans;
    }
}