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


//optimal
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
        if(head==null || head.next==null){
            return head;
        }
        ListNode zerohead=new ListNode(-1);
        ListNode onehead=new ListNode(-1);
        ListNode twohead=new ListNode(-1);

        ListNode zero=zerohead;
        ListNode one=onehead;
        ListNode two=twohead;

        ListNode temp =head;
        while(temp!=null){
            if(temp.val==0){
                zero.next=temp;
                zero=temp;
            }
            else if(temp.val==1){
                one.next=temp;
                one=temp;
            }
            else{
                two.next=temp;
                two=temp;
            }
            temp=temp.next;
        }
        zero.next=(onehead.next!=null) ? onehead.next : twohead.next; 
        one.next=twohead.next;
        two.next=null;
        ListNode newHead=zerohead.next;
        return newHead;
    }
}
