class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList();
        if(digits.length()==0){
            return ans;
        }
        String[] codes={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        return sol(digits,codes);
    }

    public List<String> sol(String digits,String[] codes){
        if(digits.length()==0){
            List<String> temp=new ArrayList();
            temp.add("");
            return temp;
        }
        char ch=digits.charAt(0);
        String rem=digits.substring(1);
        List<String> res=sol(rem,codes);
        String val=codes[ch-'0'];
        List<String> mres=new ArrayList();
        for(String s: res){
            for(int i=0;i<val.length();i++){
                char c=val.charAt(i);
                mres.add(c+s);
            }
        }
        return mres;
    }
}