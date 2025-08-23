import java.util.*;
class Main{
public static void SelectionSort(int arr[]){
    int n=arr.length;
    for(int i=0;i<n;i++){
        int minPos=i;
        for(int j=i;j<n;j++){
            if(arr[minPos]>arr[j]){
                minPos=j;
            }
        }
        int temp=arr[minPos];
        arr[minPos]=arr[i];
        arr[i]=temp;
    }
}

public static void main(String args[]){
    int arr[]={13,46,24,52,20,9};
   SelectionSort(arr);
   System.out.println(Arrays.toString(arr));
}
}
