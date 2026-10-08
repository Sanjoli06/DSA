class Solution {
    public String reverseByType(String s) {
        int n=s.length();
        int i=0;
        int j=n-1;

        char[] arr=s.toCharArray();

        while(i<=j){
            if(Character.isLowerCase(s.charAt(i)) && Character.isLowerCase(s.charAt(j))){
                char ch=arr[i];
                arr[i]=arr[j];
                arr[j]=ch;

                i++;
                j--;
            }

            else if(!Character.isLowerCase(s.charAt(i))){
                i++;
            }
            else j--;
        }

        i=0;
        j=n-1;

        while(i<=j){
            if(!Character.isLowerCase(s.charAt(i)) && !Character.isLowerCase(s.charAt(j))){
                char ch=arr[i];
                arr[i]=arr[j];
                arr[j]=ch;
                i++;
                j--;
            }

            else if(Character.isLowerCase(s.charAt(i))){
                i++;
            }
            else j--;
        }

        return new String(arr);
    }
}