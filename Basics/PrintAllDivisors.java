  import java.util.*;
  class Main{
       public static List<Integer> divisors(int n) {
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                res.add(i);
            }
        }
        return res;
    }
  
  public static void main(String[] args) {
        int n = 6;
        System.out.println(divisors(n));
    }
}
