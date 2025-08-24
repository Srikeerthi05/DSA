import java.util.*;
class Main{
    static void InsertionSort(int arr[]){
        int n=arr.length;
         for(int i=1;i<n;i++){
             int curr=arr[i];
             int prev=i-1;
             while(prev>=0 && arr[prev]>curr){
                 arr[prev+1]=arr[prev];
                 prev--;
             }
             arr[prev+1]=curr;
         }
    }
    public static void main(String args[]){
        int arr[]={14,9,15,12,6,8,13};
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
}
