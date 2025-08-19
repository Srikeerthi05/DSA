import java.util.*;
class Main{
    public static void main(String args[]){
        int arr[]={10,2,3,7,11,1};
        int n=arr.length;
        Arrays.sort(arr);
        int max=arr[n-1];
        int min=arr[0];
        System.out.print(max+" "+min);
    }
}
