// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;
class Choc {
    public static int Choc(int arr[],int m){
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=0;i+m-1<arr.length;i++){
            int diff=arr[i+m-1]-arr[i];
            if(diff<min)
            min=diff;
            
            
        }
        return min;
    }
    
    public static void main(String[] args) {
        int arr[]={7,3,2,4,9,12,56};
        int m=3;
        System.out.println(Choc(arr,m));
        
    }
}
