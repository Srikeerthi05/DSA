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
public static Node convertArrtoDLL(int arr[]){
    Node head=new Node(arr[0]);
    Node prev=head;
    for(int i=1;i<arr.length-1;i++){
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
    printList(head);
}
}
