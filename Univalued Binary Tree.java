/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isUnivalTree(TreeNode root) {
        return sol(root,root.val);
    }

    public boolean sol(TreeNode root,int data){
        if(root==null){
            return true;
        }
        if(root.val!=data){
            return false;
        }

        boolean l=sol(root.left,data);
        boolean r=sol(root.right,data);
        return l&&r;
    }
}