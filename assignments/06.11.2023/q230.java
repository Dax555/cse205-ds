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
    List<Integer> l = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        in(root,l);
        return l.get(k-1);
    }
    private void in(TreeNode root, List<Integer> l){
        if(root==null){
            return;
        }
        in(root.left,l);
        l.add(root.val);
        in(root.right,l);
    }
}