class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = head;
        int len = 0;

        while(temp!=null){
            len++;
            temp = temp.next;
        }

        int pos = len - n;
        temp = dummy;

        for(int i = 0 ; i<pos ; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;

        return dummy.next;
    }
}