//place tiles of size 1xm in floor of size nxm
import java.util.*;
class Main {
    public static int Tiling(int m,int n){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        //can place tiles in two ways
        int vertical=Tiling(m,n-m);
        int horizontal=Tiling(m,n-1);
        int totalPaths=vertical+horizontal;
        return totalPaths;
         
    }
    public static void main(String[] args) {
        int n=4;
        int m=2;
        System.out.println(Tiling(m,n));
    }
}
