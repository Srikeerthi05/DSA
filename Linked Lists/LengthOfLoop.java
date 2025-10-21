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

//optimal-tortoise-hare
class Solution { 
    public int lengthOfLoop(Node head) { 
        Node slow = head;
        Node fast = head; 
        while (fast != null && fast.next != null) { 
            slow = slow.next; 
            fast = fast.next.next; 
            if (slow == fast) { 
                return countLoopLength(slow,fast);
            }
        } 
        return 0;
    }
    // Function to count loop length
    public int countLoopLength(Node slow, Node fast) {
        slow=slow.next;
        int length = 1; 
        while (slow!=fast) {
            slow=slow.next;
            length++;
        }
        return length;
    }
} 
