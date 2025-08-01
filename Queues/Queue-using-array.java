class MyQueue {

    public static int front, rear;
    public static int arr[] = new int[100005];

    MyQueue() {
        front = -1;
        rear = -1;
    }
    public static boolean isEmpty(){
        return (rear==-1);
    }

    // Function to push an element x in a queue.
    void push(int x) {
        // Your code here
        if(rear==arr.length-1){
            return;
            
        }
        rear=rear+1;
        arr[rear]=x;
    }

    // Function to pop an element from queue and return that element.
    int pop() {
        if(isEmpty()){
            return -1;
        }
        front=arr[0];
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
        rear--;
        return front;
    }
}
