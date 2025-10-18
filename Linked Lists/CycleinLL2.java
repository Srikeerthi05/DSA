//bruteforce
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode, Integer> mp=new HashMap<>();
        ListNode temp=head;
        while(temp!=null){
            if(mp.containsKey(temp)){
                return temp;
            }
            else{
                mp.put(temp,1);
            }
            temp=temp.next;
        }
        return null;
    }
}

//optimal
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                ListNode start=head;
                while(start!=slow){
                    start=start.next;
                    slow=slow.next;

                }
            return start;
            }
        }
      return null;  
    }
}
