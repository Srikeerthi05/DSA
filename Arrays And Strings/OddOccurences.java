//brute
import java.util.*;
class Main {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,3,1,3};
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count%2!=0){
                System.out.print("Odd Occurence: "+arr[i]+" ");
                break;
            }
        }
    }
}
