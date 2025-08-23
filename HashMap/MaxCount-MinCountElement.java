import java.util.*;

public class Main {
    static void Frequency(int arr[], int n) {
         HashMap<Integer,Integer> map=new HashMap<>();
         for(int i=0;i<n;i++){
             if(map.containsKey(arr[i])){
                 map.put(arr[i],map.get(arr[i])+1);
             }
             else{
                  map.put(arr[i],1);
             }
         }
         int maxElement=0;
         int minElement=0;
         int maxCount=Integer.MIN_VALUE;
         int minCount=Integer.MAX_VALUE;
         for(Map.Entry<Integer,Integer> e:map.entrySet()){
             int count=e.getValue();
             int element=e.getKey();
             if(count>maxCount){
                 maxElement=element;
                 maxCount=count;
             }
             if(count<minCount){
                 minElement=element;
                 minCount=count;
             }
         }
        System.out.println("Highest frequency element:" + maxElement);
        System.out.println("Lowest frequency element is:" + minElement);
    }
      public static void main(String args[]) {
        int arr[] = {10, 5, 10, 15, 10, 5};
        int n = arr.length;
        Frequency(arr, n);
    }
} 
