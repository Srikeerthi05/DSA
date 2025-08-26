import java.util.*;
class Main {
    public static void InsertionSortRecursive(int arr[],int i){
        int n=arr.length;
        if(i==n){
            return;
        }
         int curr=arr[i];
            int prev=i-1;
        while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
    }
            arr[prev+1]=curr;
        
        InsertionSortRecursive(arr,i+1);
    }
    public static void main(String[] args) {
       int arr[]={12,34,1,45,6};
       InsertionSortRecursive(arr,1);
       System.out.println(Arrays.toString(arr));
    }
}
