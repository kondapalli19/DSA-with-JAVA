https://leetcode.com/problems/binary-tree-right-side-view/?envType=study-plan-v2&envId=leetcode-75
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
    int maxlevel=0;
    List<Integer> ans=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null) return ans;
        rightView(root, 1);
        return ans;
    }
    \
    void rightView(TreeNode root, int level){
        if(root==null) return;
        if(maxlevel<level){
            ans.add(root.val);
            maxlevel=level;
        } 
        rightView(root.right, level+1);
        rightView(root.left, level+1);
    }
}
