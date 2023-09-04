class Solution {
    public ListNode middleNode(ListNode head) {
   
        int len = 0;
        ListNode temp = head;

        if (head == null) {
            return null;
        }

        while (temp != null) {
            len++;
            temp = temp.next;
        }

        int middle = len / 2;
        temp = head;

        for (int i = 0; i < middle; i++) {
            temp = temp.next;
        }

        return temp;

        
    }
}