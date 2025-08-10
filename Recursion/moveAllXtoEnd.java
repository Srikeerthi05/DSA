 class Main {
    public static void moveAllX(String str,int i,int count, String newStr){
        if(i==str.length()){
            for(int j=0;j<count;j++){
                newStr+='x';
            }
            System.out.println(newStr);
            return;
        }
        char currChar=str.charAt(i);
        if(currChar=='x'){
            count++;
            moveAllX(str,i+1,count,newStr);
        }
        else{
            newStr+=currChar;
            moveAllX(str,i+1,count,newStr);
        }
    }
    public static void main(String[] args) {
        String str="axbcxxd";
        moveAllX(str,0,0,"");
         
    }
}
