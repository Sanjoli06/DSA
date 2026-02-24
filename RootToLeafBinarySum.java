class Solution {
    static int ans=0;
    public static void find(TreeNode root,String s){
        if(root==null){
            return ;
        }
        if(root.left==null && root.right==null){
            int curr=get(s+root.val);
            ans+=curr;
        }
        find(root.left,s+root.val);
        find(root.right,s+root.val);
    }
    public static int get(String s){
        int a=0,p=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                a+=Math.pow(2,p);
            }
            p++;
        }
        return a;
    }
    public int sumRootToLeaf(TreeNode root) {
        ans=0;
        find(root,"");
        return ans;
    }
}
