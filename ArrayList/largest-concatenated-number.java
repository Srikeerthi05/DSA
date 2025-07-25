//optimal using converting them into strings
import java.util.*;

class OptimalLargestNumber {
    static boolean compare(String s1,String s2){
        return (s1+s2).compareTo(s2+s1)>0; //compare two concat of two strings 
    }
    
    static String findLargest(int arr[]){
        ArrayList<String> strings=new ArrayList<>();
        for(int n:arr){
            strings.add(String.valueOf(n)); //add the values into the list
        }
        
        Collections.sort(strings,(a,b)->compare(a,b)?-1:1);//compare a,b with result of compare method
        
        if(strings.get(0).equals("0")){
            return "0";
        }
        
        StringBuilder result=new StringBuilder();//added to same string
        for(String n:strings){
            result.append(n);
        }
        return  result.toString();
    }

    public static void main(String[] args) {
        int[] arr = {3, 30, 34, 5, 9};
        System.out.println("Optimal Result: " + findLargest(arr));
    }
}
