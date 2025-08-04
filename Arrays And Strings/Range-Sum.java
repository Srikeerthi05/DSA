// brute force
import java.util.*;
public class BruteForceRangeSum {
    public static int[] bruteForceSum(int[] arr, int[][] queries) {
        int res[]=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int l=queries[i][0];
            int r=queries[i][1];
            int sum=0;
            for(int j=l;j<=r;j++){
                sum+=arr[j];
            }
            res[i]=sum;
        }
    return res;
}
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 1, 3, 4, 5, 2, 8}; 
        int[][] queries = {
            {0, 4}, 
            {1, 3},  
            {2, 4}   
        };
        int[] result = bruteForceSum(arr, queries);
        System.out.println("Range Sum Results:");
        for (int res : result) {
            System.out.println(res);
        }
    }
}
