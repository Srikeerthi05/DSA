 
 
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
      ListNode d=new ListNode(-1);
      ListNode curr=d;
      while(list1!=null && list2!=null){
        if(list1.val<list2.val){
            curr.next=list1; 
            list1=list1.next;
        }else{
            curr.next=list2;
            list2=list2.next; 
            }
            curr=curr.next;
      }  
      if(list1!=null){
        curr.next=list1;
      }
      else{
        curr.next=list2;
      }
      return d.next;
    }
}
