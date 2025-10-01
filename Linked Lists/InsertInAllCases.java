  import java.util.*;
  class LinkedList{
    public static class Node{
        int data;
        Node next;
         public Node(int data){
            this.data=data;
            this.next=null;
        }
        public Node(int data, Node next){
            this.data=data;
            this.next=next;
        }
    } 
    public static Node head;
    public static Node tail;
    
    public static Node InsertAtFirst(Node head, int element){
        return new Node(element,head);
    }
    public static Node InsertAtLast(Node head, int element){
        if(head==null){
            return new Node(element);
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node newNode=new Node(element);
        temp.next=newNode;
        return head;
    }
    public static Node InsertAtPos(Node head, int element, int pos){
        if(head==null){
            return new Node(element);
        }
        if(pos==1){
            Node temp=new Node(element,head);
            return temp;
        }
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            if(count==pos-1){
                Node newNode=new Node(element);
                newNode.next=temp.next;
                temp.next=newNode;
                break;
            }
            temp=temp.next;
        }
        return head;
    }
    public static Node InsertBefVal(Node head, int val, int element){
        if(head==null){
            return null;
        }
        if(head.data==val){
            return new Node(element,head);
        }
        Node temp=head;
        while(temp.next!=null){
            if(temp.next.data==val){
                Node newNode=new Node(element,temp.next);
                temp.next=newNode;
                break;
            }
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
        head=InsertAtFirst(head,2);
        head=InsertAtLast(head,5);
        head=InsertAtPos(head,3,3);
        head=InsertBefVal(head,5,4); 
        ll.printList(); 
    }
}
