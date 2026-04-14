class Solution {
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        int ans=1;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode curr=q.remove();
                if(curr.left==null  && curr.right==null){
                    return ans;
                }
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            ans++;
        }
        return ans;
    }
}

// DFS approach
class Solution {
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        return sol(root);
    }

    public int sol(TreeNode root){
        if(root==null) return Integer.MAX_VALUE;
        else if(root.left==null && root.right==null) return 1;
        int l=sol(root.left);
        int r=sol(root.right);
        return Math.min(l,r)+1;
    }
}