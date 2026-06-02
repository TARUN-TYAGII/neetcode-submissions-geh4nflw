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
    int ans =Integer.MIN_VALUE;

    public int getSum(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = Math.max(0, getSum(root.left));
        int right = Math.max(0, getSum(root.right));
        int val = root.val + left + right;
        ans = Math.max(ans,val);
        return root.val + Math.max(left,right);

    }

    public int maxPathSum(TreeNode root) {
        getSum(root);
        return ans;        
    }
}
