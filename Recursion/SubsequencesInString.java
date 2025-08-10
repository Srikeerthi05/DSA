 class Main {
     public static void subsequences(String str, int i , String newStr){
          if(i==str.length()){
              System.out.println(newStr);
              return;
          }
          char currChar=str.charAt(i);
          //to be 
          subsequences(str,i+1,newStr+currChar);
          //to not be
          subsequences(str,i+1,newStr);
     }
    public static void main(String[] args) {
        String str="abc";
        subsequences(str,0,"");
    }
}
