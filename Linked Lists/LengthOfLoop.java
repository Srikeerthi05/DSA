//brute-force
class Solution { 
    public int lengthOfLoop(Node head) { 
        HashMap<Node,Integer> visited=new HashMap<>();
        Node temp=head;
        int timer=0;
        while(temp!=null){
        if(visited.containsKey(temp)){
            int looplength= timer- visited.get(temp);
            return looplength;
        }
        visited.put(temp,timer);
        temp=temp.next;
        timer++;
        }
        return 0;
    }
}
