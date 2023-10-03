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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if(root.val==key) return getReplacement(root);
        root.left=deleteNode(root.left, key);
        root.right=deleteNode(root.right, key);
        return root;
    }
    private TreeNode getReplacement(TreeNode root){
        if(root.left==null && root.right==null) return null;
        if(root.left==null) return root.right;
        if(root.right==null) return root.left;
        TreeNode replacement=root.right;
        if(replacement.left==null){
            replacement.left=root.left;
        }
        else{
            TreeNode parent=root;
            while(replacement.left!=null){
                parent=replacement;
                replacement=replacement.left;
            }
            parent.left=replacement.right;
            replacement.right=root.right;
            replacement.left=root.left;
        }
        return replacement;
    }
}
