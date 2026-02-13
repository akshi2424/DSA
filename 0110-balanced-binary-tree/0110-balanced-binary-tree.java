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
    public boolean isBalanced(TreeNode root) {
        if(root==null)return true;

        int leftHeight=findHeight(root.left);
        int rightHeight=findHeight(root.right);

        return leftHeight!=0 && rightHeight!=0 && Math.abs(leftHeight-rightHeight)<=1;
    }

    int findHeight(TreeNode root){
        if(root==null)return 0;

        return Math.max(findHeight(root.left),findHeight(root.right))+1;
    }
}