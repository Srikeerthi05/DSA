// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    static int first=-1;
    static int last=-1;
    public static void findOccurence(String s ,int idx, char element){
        if(idx==s.length()-1){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar=s.charAt(idx);
        if(currChar==element){
            if(first==-1){
                first=idx;
            }
            else{
                last=idx;
            }
        }
        findOccurence(s, idx+1, element);
         
    }
    public static void main(String[] args) {
       String s="abaacdacfaah";
       findOccurence(s,0,'a');
    }
}
