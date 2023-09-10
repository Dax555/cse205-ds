public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode t1 = head;
        ListNode t2 = head;

        while(t1!=null && t1.next!=null){
            t1 = t1.next.next;
            t2 = t2.next;

            if(t1==t2){
                break;
            }
        }

        

        if(t1==null||t1.next==null){
            return null;
        }
        t1 = head;

        while(t1!=t2){
            t1 = t1.next;
            t2 = t2.next;
        }

        return t1;

        
    }
}