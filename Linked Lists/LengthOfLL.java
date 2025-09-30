class LinkedList{
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    
   public static int LengthOfLL(Node head){
       int count=0;
       Node temp=head;
        while(temp!=null){ 
            temp=temp.next;
            count++;
        }
        return count;
   }
   public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        LinkedList ll=new LinkedList();
        ll.head=new Node(1);
        ll.head.next=new Node(2);
        ll.head.next.next=new Node(3);
        ll.printList();
        System.out.print(ll.LengthOfLL(head));
    }
}
