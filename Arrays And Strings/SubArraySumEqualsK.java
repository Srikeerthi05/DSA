//brute- display only one result so for that we used return!!
import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of the array: ");
       int n=sc.nextInt();
       System.out.println("Enter the target sum: ");
       int l=sc.nextInt();
       System.out.println("Enter the Array Elements: ");
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       for(int i=0;i<n;i++){
           for(int j=i;j<n;j++){
               int sum=0;
               for(int k=i;k<=j;k++){
                   sum=sum+arr[k];
               }
               if(sum==l){
                   System.out.println("The Indices are: "+(i+1)+ " "+(j+1));
                   return;
               }
           }
       }
    }
}
