class Solution {
    static boolean searchKey(int n, Node head, int key) {
        // Code here
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return true;
            }
            temp=temp.next;
            i++;
        }
        return false;
    }
}
