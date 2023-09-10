public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode t1 = head;
        ListNode t2 = head;

        while(t1!=null && t1.next!=null){
            t2 = t2.next;
            t1 = t1.next.next;

            if(t1==t2){
                return true;
            }
        }
        return false;
    }
}