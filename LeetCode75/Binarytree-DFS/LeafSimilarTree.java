https://leetcode.com/problems/leaf-similar-trees/?envType=study-plan-v2&envId=leetcode-75
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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        StringBuilder s=new StringBuilder();
        StringBuilder t=new StringBuilder();
        createLeaf(root1, s);
        createLeaf(root2, t);
        return s.toString().equals(t.toString());
    }
    public void createLeaf(TreeNode root, StringBuilder s){
        if(root == null){
            return;
        }
        if(root.left==null && root.right==null){
            s.append(root.val);
            s.append("*");
        }
        createLeaf(root.left,s);
        createLeaf(root.right,s);
    }
}
