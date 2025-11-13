//brute
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp=headA;
        HashMap<ListNode, Integer> mp=new HashMap<>();
        while(temp!=null){
            mp.put(temp, 1);
            temp=temp.next;
        }
        temp=headB;
        while(temp!=null){
            if(mp.containsKey(temp)){
                return temp;
            }
            temp=temp.next;
        }
        return null;       
    }
}
