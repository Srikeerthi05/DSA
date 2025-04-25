class Solution {
    public ListNode insertAtHead(ListNode head, int X) {
        ListNode newNode=new ListNode(X);
         newNode.next=head;
         head=newNode;
        if(head==null){
            head=newNode;
         }
         

         return head;
    }

}
