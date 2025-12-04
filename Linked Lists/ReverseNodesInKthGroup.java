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
    public ListNode reverseKGroup(ListNode head, int k) {
        
        if(head == null || k<=1){
            return head;
        }
        ListNode temp=head;
        ListNode prevNode =null;
        while(temp!=null){
            ListNode kth=findKthNode(temp,k);
            if(kth==null){
                if(prevNode!=null){
                    prevNode.next=temp;
                }
                break;
            }
            ListNode nextNode=kth.next;
            kth.next=null;
            ListNode newHead=reverse(temp);
            if(temp==head){
                head=newHead;
            }
            else{
                prevNode.next=newHead;
            }
            prevNode=temp;
            temp.next=nextNode;

            temp=nextNode;
        }
        return head;
    }
     private static ListNode findKthNode(ListNode start, int k) {
        int count = 1;
        ListNode curr = start;
        while (curr != null && count < k) {
            curr = curr.next;
            count++;
        }
        return curr;
     }
      private static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
