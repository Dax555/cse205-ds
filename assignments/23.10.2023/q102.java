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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> al = new ArrayList<>();
        lvl(root,0,al);

        return al;
    }
    static void lvl(TreeNode root,int l, List<List<Integer>> al){
        if(root==null){
            return;
        }

        if(al.size()==l){
            List<Integer> li = new ArrayList<>();
            li.add(root.val);
            al.add(li);
        }
        else{
            al.get(l).add(root.val);
        }
        lvl(root.left, l+1, al);
        lvl(root.right, l+1,  al);



    }
}