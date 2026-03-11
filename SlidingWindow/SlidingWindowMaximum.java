//brute
import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of the array: ");
       int n=sc.nextInt();
       System.out.println("Enter the window size: ");
       int k=sc.nextInt();
       int arr[]=new int[n];
       System.out.println("Enter the elements of the array: ");
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       List<Integer> list=new ArrayList<>();
       for(int i=0;i<=n-k;i++){
           int max=arr[i];
           for(int j=i;j<i+k;j++){
               max=Math.max(max, arr[j]);
           }
            list.add(max);
       }
       System.out.print("Maximum in the window is: "+list);
    }
}

//optimal-using deque
import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of the array: ");
       int n=sc.nextInt();
       System.out.println("Enter the window size: ");
       int k=sc.nextInt();
       int arr[]=new int[n];
       System.out.println("Enter the elements of the array: ");
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       List<Integer> list=new ArrayList<>();
       Deque<Integer> dq=new LinkedList<>();
       for(int i=0;i<n;i++){
           if(!dq.isEmpty()&& dq.peekFirst()<=i-k){
               dq.pollFirst();
           }
           while(!dq.isEmpty() && arr[dq.peekLast()]<=arr[i]){
               dq.pollLast();
            
           }
            dq.offerLast(i);
            if(i>=k-1){
           list.add(arr[dq.peekFirst()]);
       }
       }
        
       System.out.print("Maximum in the window is: "+list);
    }
}
