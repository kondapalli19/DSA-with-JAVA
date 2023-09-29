https://leetcode.com/problems/path-sum-iii/?envType=study-plan-v2&envId=leetcode-75
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
    private int pathSum_(TreeNode root, long targetSum){
        if(root==null){
            return 0;
        }
        long res=0;
        if(root.val==targetSum) res++;
        res+= pathSum_(root.left, targetSum-root.val);
        res+=pathSum_(root.right, targetSum-root.val);
        return (int)res;   
    }
    public int pathSum(TreeNode root, int sum) {
        if(root==null){
            return 0;
        }
        
        return pathSum(root.left, sum) + pathSum_(root, sum) + pathSum(root.right, sum);
    }
}
