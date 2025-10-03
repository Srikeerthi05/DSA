class DoublyLL{
    static class Node{
        int data;
        Node next;
        Node prev;
        
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
        
        public Node(int data, Node next, Node prev){
            this.data=data;
            this.next=next;
            this.prev=prev;
    }  
}
public static Node deleteHead(Node head){
    if(head==null || head.next==null){
        return null;
    } 
    head=head.next;
    head.prev=null;
    return head;
}
public static Node deleteKthElement(Node head, int k){
    int count=0;
    Node temp=head;
    while(temp!=null){
        count++;
        if(count ==k ){
            break;
        }
        temp=temp.next;
    }
    Node back=temp.prev;
    Node front=temp.next;
    
    if(back==null && front ==null){
        return null;
    }
    else if(back==null){
        deleteHead(head);
    }
    else if(front==null){
        deleteTail(head);
    }
    back.next=front;
    front.prev=back;
    temp.next=null;
    temp.prev=null;
    return head;
}
public static Node deleteTail(Node head){
    Node tail=head;
    while(tail.next!=null){
        tail=tail.next;
    }
    Node back=tail.prev;
    back.next=null;
    tail.prev=null;
    return head;
}
public static Node convertArrtoDLL(int arr[]){
    Node head=new Node(arr[0]);
    Node prev=head;
    for(int i=1;i<arr.length;i++){
        Node temp=new Node(arr[i],null,prev);
        prev.next=temp;
        prev=temp;
    }
    return head;
}
public static void printList(Node head){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+" <-> ");
        temp=temp.next;
    }
    System.out.println("null");
}
public static void main(String args[]){
    int arr[]={1,2,3,4,5};
    Node head=convertArrtoDLL(arr);
    head=deleteHead(head);
    head=deleteTail(head);
    head=deleteKthElement(head, 3);
    printList(head);
}
}
