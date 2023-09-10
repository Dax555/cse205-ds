public class Solution {
    public ListNode getIntersectionNode(ListNode l1, ListNode l2) {
        while(l1!=null){
            ListNode t = l2;
            while(t!=null){
                if(t==l1){
                    return l1;
                }
                t = t.next;
            }
            l1 = l1.next;
        }
        

        return null;

        
    }
}