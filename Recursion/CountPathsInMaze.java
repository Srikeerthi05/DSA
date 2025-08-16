//count total number of paths from (0,0) to (n,m)
import java.util.*;
class Main {
    public static int countPaths(int m,int n, int i, int j){
        if(i==n||j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        //move downwards
        int downPaths= countPaths(m,n,i,j+1);
        //move right
        int rightPaths= countPaths(m,n,i+1,j);
        //total=down+right
        return downPaths+rightPaths;
    }
    public static void main(String[] args) {
        int n=3;
        int m=4;
        System.out.println(countPaths(m,n,0,0));
    }
}
