import java.util.*;
class Main {
    static ArrayList<Integer> list=new ArrayList<>();
    public static void preComputeFib(int maxN){
        list.clear();
        list.add(0);
        list.add(1);
        if(maxN==0){
            return;
        }
        for(int i=2;i<=maxN;i++){
            list.add(list.get(i-1)+list.get(i-2));
        }
    }
    public static int getFib(int n){
        if(n<0||n>=list.size()){
            throw new IllegalArgumentException("Invalid");
        }
        else{
            return list.get(n);
        }
    }
    public static void main(String[] args) {
        int maxN=100;
        preComputeFib(maxN);
        System.out.println(getFib(3));
    }
}
