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
    
    public static Node deleteAtHead(Node head){
        Node temp=head;
        head=head.next;
        return head;
    }
    public static Node deleteAtTail(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node temp =head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
    public static Node deleteAtPos(Node head ,int k){
        if(head == null){
            return head;
        }
        if(k==1){
            Node temp=head;
            head=head.next;
            return head;
        }
        int count=0;
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            count++;
            if(count==k){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
    
    public static Node deleteVal(Node head ,int value){
        if(head == null){
            return head;
        }
        if(head.data==value){
            Node temp=head;
            head=head.next;
            return head;
        } 
        Node temp=head;
        Node prev=null;
        while(temp!=null){ 
            if(temp.data==value){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
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
        ll.head.next.next.next=new Node(4);
        head=deleteAtHead(head);
        head=deleteAtTail(head);
        head=deleteAtPos(head,3);
        head=deleteVal(head,2);
        ll.printList();
    }
}
