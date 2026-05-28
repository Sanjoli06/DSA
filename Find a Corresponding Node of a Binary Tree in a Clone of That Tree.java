
class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(cloned==null) return null;
        if(cloned.val==target.val){
            return cloned;
        }
        TreeNode l=getTargetCopy(original.left,cloned.left,target);
        if(l!=null) return l;
        TreeNode r=getTargetCopy(original.right,cloned.right,target);
        return r;
    }
}