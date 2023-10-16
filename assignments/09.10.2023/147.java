/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode temp = head;
        int len = 0 ;
        while(temp!=null){
            len++;
            temp = temp.next;
        }
        temp = head;
        int[] ans = new int[len];
        for(int i = 0 ; i < ans.length ;i++){
            ans[i] = temp.val;
            temp = temp.next;
        }
        mergeSort(ans);
        ListNode prev = head;
        for(int i = 0 ; i < len ; i++){
            prev.val = ans[i];
            prev = prev.next;
        }

        return head;
    }
    public static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n <= 1) {
            return; 
        }

        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = arr[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int n1 = left.length;
        int n2 = right.length;
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < n1) {
            arr[k++] = left[i++];
        }
        while (j < n2) {
            arr[k++] = right[j++];
        }
}