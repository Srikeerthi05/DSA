import java.util.*;
class Main {
    public static void print(ArrayList<Integer> set){
        for(int i=0;i<set.size();i++){
            System.out.print(set.get(i)+" ");
        }
        System.out.println();
    }    
    public static void subsets(int n, ArrayList<Integer> set){
        if(n==0){
            print(set);
            return;
        }
        //to add--to be
        set.add(n);
        subsets(n-1,set);
        //to remove--to not be
        set.remove(set.size()-1);
        subsets(n-1,set);
         
    }
    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer> set=new ArrayList<>();
         subsets(n,set);
    }
}
