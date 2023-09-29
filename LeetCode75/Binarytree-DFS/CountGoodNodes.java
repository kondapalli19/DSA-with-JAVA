https://leetcode.com/problems/count-good-nodes-in-binary-tree/?envType=study-plan-v2&envId=leetcode-75
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
    public int goodNodes(TreeNode root) {
        int[] count = new int[1];
        if(root == null){
            return 0;
        }
        countgoodNodes(root, count, root.val);
        return count[0];
    }
    public void countgoodNodes(TreeNode root, int[] count, int max){
        
        if(root == null){
            return;
        }
        if(root.val>=max){
            max=root.val;
            count[0]++;
        }
        countgoodNodes(root.left, count, max);
        countgoodNodes(root.right, count, max);
    }
}
