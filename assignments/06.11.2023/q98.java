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
    public boolean isValidBST(TreeNode root){
        in(root,l);

        if(l.size()==1) return true;
        for(int i = 1 ; i < l.size() ; i++){
            if(l.get(i)<=l.get(i-1)) return false;
        }

        return true;
    }
    private void in(TreeNode root, List<Integer> l){
        if(root==null) return;
        in(root.left,l);
        l.add(root.val);
        in(root.right,l);
    }
}