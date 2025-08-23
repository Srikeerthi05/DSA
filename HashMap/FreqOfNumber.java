import java.util.*;
class Main {
    public static void main(String[] args) {
        int arr[]={1,2,3,3,4,1,1 ,2};
        int n=arr.length; 
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int key=arr[i];
            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }
            else{
                map.put(key,1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
