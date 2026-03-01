class Solution {
    public String trimTrailingVowels(String s) {
        StringBuilder sb=new StringBuilder();
            for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
                if((ch=='a' || ch=='i' || ch=='o' || ch=='u' || ch=='e') && sb.length()==0){
                    continue;
                }
                else{
                    sb.append(ch);
                }
            }
        return sb.reverse().toString();
    }
}
