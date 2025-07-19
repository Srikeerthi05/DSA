// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.HashSet;
class Main {
    public static boolean pairsum(int arr[],int target){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int diff=target-arr[i];
             if(set.contains(diff)){
            return true;
        }
        set.add(arr[i]);
        
        }
        
         
        return false;
    }
    public static void main(String[] args) {
         int[] arr = {10,5,9,2,1};
        int target = 30;

        if (pairsum(arr, target))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
