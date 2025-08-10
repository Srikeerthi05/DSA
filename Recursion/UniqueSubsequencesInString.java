 import java.util.*;
 class Main {
     public static void subsequences(String str, int i , String newStr,HashSet<String> set){
          if(i==str.length()){
               if(set.contains(newStr)){
                   return;
               }
               else{
                   System.out.println(newStr);
                   set.add(newStr);
                   return;
               }
          }
          char currChar=str.charAt(i);
          //to be 
          subsequences(str,i+1,newStr+currChar,set);
          //to not be
          subsequences(str,i+1,newStr,set);
     }
    public static void main(String[] args) {
        String str="aaa";
        HashSet<String> set=new HashSet<>();
        subsequences(str,0,"",set);
    }
}
