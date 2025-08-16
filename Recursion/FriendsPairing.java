//no of ways you can pair friends in either single or as a pair
import java.util.*;
class Main {
    public static int Pairing(int n){
        if(n<=1){
            return 1;
        }
        int ways1=Pairing(n-1);
        int ways2= (n-1)*Pairing(n-2);
        return ways1+ways2;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(Pairing(n));
    }
}
