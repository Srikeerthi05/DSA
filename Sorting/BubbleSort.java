import java.util.*;
class Main{
    static void BubbleSort(int arr[]){
        int n=arr.length;
        for(int i=n-1;i>=1;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String args[]){
        int arr[]={3,2,1,6,4,5};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
}
