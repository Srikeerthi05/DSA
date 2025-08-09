class Main {
    public static void RevStr(String s ,int idx){
        if(idx==0){
            System.out.print(s.charAt(idx)+" ");
            return;
        }
        
        System.out.print(s.charAt(idx)+" ");
        RevStr(s, idx-1);
         
    }
    public static void main(String[] args) {
       String s="abcd";
       RevStr(s, s.length()-1);
       
    }
}
