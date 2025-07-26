public class template{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }

    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }

        // if(root.data>val){ 
            root.left=insert(root.left,val);
        }
    }
    public static void main(String args[]){
        int values[]={5,1,3,4,2,7};
        Node root=null;

    }
}