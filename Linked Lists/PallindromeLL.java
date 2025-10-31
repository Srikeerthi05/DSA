//brute force
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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> s=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            s.push(temp.val);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            if(temp.val!=s.peek())
            return false;
            temp=temp.next;
            s.pop();
        }
        return true;
    }
}


//optimal
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
      public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode newHead=reverseList(head.next);
        ListNode front =head.next;
        front.next=head;
        head.next=null;
        return newHead;  
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newHead=reverseList(slow.next);
        ListNode first=head;
        ListNode second=newHead;
        while(second!=null){
            if(first.val!=second.val){
                reverseList(newHead);
                return false;
            }
            first=first.next;
            second=second.next;
        }
        reverseList(newHead);
        return true; 
    }
}
