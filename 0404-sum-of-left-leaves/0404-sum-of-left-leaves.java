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
    public int sum = 0;
    public void recursive(TreeNode root, char dir){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null && dir=='l'){
            sum+=root.val;
            return;
        }

        recursive(root.left,'l');
        recursive(root.right, 'r');
    }
    public int sumOfLeftLeaves(TreeNode root) {
        recursive(root,'c');
        return sum;
    }
}