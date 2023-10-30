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
    public int maxPathSum(TreeNode root) {
        int[] m = new int[1];
        m[0] = Integer.MIN_VALUE;
        sum(root,m);

        return m[0];
    }
    static int sum(TreeNode root, int[] m){
        if(root==null){
            return 0;
        }

        int ls = Math.max(0,sum(root.left,m));
        int rs = Math.max(0,sum(root.right,m));

        m[0] = Math.max(m[0],ls+rs+root.val);

        return Math.max(ls,rs)+root.val;
    }
}