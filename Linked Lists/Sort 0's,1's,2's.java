//brute
/* Definition of singly Linked List:
class ListNode {
    int val;
    ListNode next;

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
*/

class Solution {
    public ListNode sortList(ListNode head) {
        ListNode temp=head;
        int count0=0;
        int count1=0;
        int count2=0;
        while(temp!=null){
            if(temp.val==0) count0++;
            else if(temp.val==1) count1++;
            else count2++;
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            if(count0>0){
                temp.val=0;
                count0--;
            }
            else if(count1>0){
                temp.val=1;
                count1--;
            }
            else{
                temp.val=2;
                count2--;
            }
            temp=temp.next;
        }
        return head;
    }
}
