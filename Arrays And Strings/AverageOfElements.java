import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int arr[]={8,7,1,6,5,9};
       int n=arr.length;
       int sum=0;
    //   int count=0;
    //   for(int i=0;i<arr.length;i++){
    //       count++;
    //   }
       for(int i=0;i<arr.length;i++){
           sum+=arr[i];
       }
       System.out.println(sum/n);
    }
}
