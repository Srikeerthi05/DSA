class MyStack {
        Queue<Integer> q1;
        Queue<Integer> q2;

    public MyStack() {
        q1=new LinkedList<>();
        q2=new LinkedList<>();
        
    }
    
    public void push(int x) {
        while(!q1.isEmpty()){
            q2.offer(q1.peek());
            q1.poll();
        }
        q1.offer(x);
        while(!q2.isEmpty()){
            q1.offer(q2.peek());
            q2.poll();
        }
        
    }
    
    public int pop() {
        int ans=q1.peek();
        q1.poll();
        return ans;
        
    }
    
    public int top() {
        return q1.peek();   
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}
