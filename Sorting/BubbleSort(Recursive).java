import java.util.*;
class Solution {
    public static int[] bubbleSortRecursive(int[] arr,int n) {
        if(n==1){
            return arr;
        }
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        bubbleSortRecursive(arr,n-1);
        return arr;
    }
    public static void main(String args[]){
        int arr[]={12,3,45,23,34};
         int n=arr.length;
        bubbleSortRecursive(arr,n);
        System.out.println(Arrays.toString(arr));
        
    }
}
