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
//optimal
import java.util.*;
class Main {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,3,1,3};
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue()%2!=0){
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
