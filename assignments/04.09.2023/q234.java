lass Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode temp = slow;
        ListNode prev = null;
        ListNode next = null;

        while(temp!=null){
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }

        ListNode first = head;
        ListNode second = prev;

        while(first!=null && second!=null){
            if(first.val!=second.val){
                return false;
            }
            first = first.next;
            second = second.next;

        }
        return true;

    }
}