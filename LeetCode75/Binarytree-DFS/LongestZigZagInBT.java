https://leetcode.com/problems/longest-zigzag-path-in-a-binary-tree/?envType=study-plan-v2&envId=leetcode-75
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
    int max=0;
    public int longestZigZag(TreeNode root) {
        if(root.left!=null){
            helper(root.left,true,1);
        }
        if(root.right!=null){
            helper(root.right, false, 1);
        }
        return max;
    }
    public void helper(TreeNode root, boolean left, int val){
        if(root.left==null && root.right==null){
            max=Math.max(max, val);
            return;
        }

        if(left){
            if(root.right!=null){
                helper(root.right, false, val+1);
            }else{
                max=Math.max(max, val);
            }
            if(root.left!=null){
                helper(root.left, true, 1);
            }
        }
        else{
            if(root.right!=null){
                helper(root.right, false, 1);
            }
            if(root.left!=null){
                helper(root.left, true, val+1);
            }
            else{
                max=Math.max(max, val);
            }
        }
    }
}
