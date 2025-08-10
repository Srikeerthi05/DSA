 class Main {
     public static boolean map[]=new boolean[26];
     public static void removeDuplicates(String str, int i , String newStr){
         if(i==str.length()){
             System.out.println(newStr);
             return;
         }
         char currChar=str.charAt(i);
         if(map[currChar-'a']==true){
             removeDuplicates(str,i+1,newStr);
         }
         else{
             newStr+=currChar;
             map[currChar-'a']=true;
             removeDuplicates(str,i+1,newStr);
         }
     }
    public static void main(String[] args) {
        String str="aabccdb";
        removeDuplicates(str,0,"");
    }
}
