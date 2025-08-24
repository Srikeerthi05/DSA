import java.util.*;
class Main{
    public static void QuickSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int pivotIndex=Partition(arr,si,ei);
        QuickSort(arr,si,pivotIndex-1);
        QuickSort(arr,pivotIndex+1,ei);
    }
        
    public static int Partition(int arr[], int si,int ei){
        int pivot=arr[ei];
        int idx=si-1;//to make space for smaller element than pivot
        for(int i=si;i<ei;i++){
            if(arr[i]<=pivot){
                idx++;
                int temp=arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
            }
        }
        idx++;
        int temp=pivot;
        arr[ei]=arr[idx];
        arr[idx]=temp;
        return idx;
        
    }
    
    public static void main(String args[]){
        int arr[]={14,9,15,12,6,8,13};
        QuickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        
    }
}
