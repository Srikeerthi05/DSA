class MinStack {
    private Stack<Integer> mins;
    private Stack<Integer> stk;


    public MinStack() {
      stk=new Stack<>();
      mins=new Stack<>(); 
    }
    
    public void push(int val) {
      stk.push(val);
      if(mins.isEmpty() || val <= mins.peek()){
        mins.push(val);
      } 
      else{
        mins.push(mins.peek());
      } 
    }
    
    public void pop() {
        stk.pop();
        mins.pop();
        
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return mins.peek();
    }
}
