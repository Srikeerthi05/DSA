import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int arr[]={8,7,1,6,5,9};
       Arrays.sort(arr);
       for(int i=arr.length/2, j=arr.length-1; i<j ; i++,j--){
           int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
       }
       for(int num:arr){
           System.out.print(num+" ");
       }
    }
}
