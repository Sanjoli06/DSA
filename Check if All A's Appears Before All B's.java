class Solution {
    public boolean checkString(String s) {
        int idxa=-1;
        int idxb=-1;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'){
                idxa=i;
            }
            else{
                idxb=i;
            }

            if(idxb!=-1 && idxa>idxb) return false;
        }
        return true;
    }
}