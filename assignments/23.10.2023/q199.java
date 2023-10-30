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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> al = new ArrayList<>();
        right(root,0,al);

        return al;
    }
    static void right(TreeNode root,int l, List<Integer> al ){
        if(root==null) return;

        if(al.size()==l){
            al.add(root.val);
        }

        right(root.right,l+1,al);
        right(root.left,l+1,al);
    }
}