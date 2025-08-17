import java.util.*;
class Implement{
    public static void main(String args[]){
        HashMap<String,Integer> map=new HashMap<>();
        map.put("India",10);
        map.put("Korea",20);
        map.put("Bali",30);
        map.put("USA",40);
        map.put("UK",50);
        System.out.println(map);
        
       System.out.println( map.get("India"));
       
       if(map.containsKey("India")||map.containsValue(20)){
           System.out.println("yes!");
       }
       else{
           System.out.println("No!");
       }
       
       for(Map.Entry<String,Integer> e:map.entrySet()){//convert to set and iterate through it.
           System.out.print(e.getKey()+" ");
           System.out.print(e.getValue()+" ");
       }
       System.out.println();
       
       Set<String> keys=map.keySet();//convert all keys to set
       System.out.println(keys+" ");
    }
}
