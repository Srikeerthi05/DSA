import java.util.*;
class Main{
    static void MergeSort(int arr[],int si,int ei){
         int n=arr.length;
         if(si>=ei){
             return;
         }
         int mid=si+(ei-si)/2;
         MergeSort(arr,si,mid);
         MergeSort(arr,mid+1,ei);
         Merge(arr,si,mid,ei);
         }
    static void Merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[(ei-si)+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid&& j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
            
        }   
    }
    public static void main(String args[]){
        int arr[]={14,9,15,12,6,8,13};
        MergeSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        
    }
}
