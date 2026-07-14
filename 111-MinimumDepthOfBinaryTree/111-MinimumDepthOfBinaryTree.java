// Last updated: 7/14/2026, 2:01:58 PM
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
    public int minDepth(TreeNode root) {
        int lc=0,rc=0;
        if(root == null) return 0;
        lc =1+minDepth(root.left);
        rc =1+minDepth(root.right);
        if(lc==1) return rc;
        if(rc==1) return lc;
        return Math.min(lc,rc);
        
    }
}