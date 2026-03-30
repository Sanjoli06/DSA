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
    public static int find(TreeNode root,boolean c){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null && c){
            return root.val;
        }
        int l=find(root.left,true);
        int r=find(root.right,false);
        return l+r;
    }
    public int sumOfLeftLeaves(TreeNode root) {
        return find(root,false);
    }
}
