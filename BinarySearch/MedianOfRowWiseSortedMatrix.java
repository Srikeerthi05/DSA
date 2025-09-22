//brute force
import java.util.*;
public class tUf {
    public static int median(int matrix[][], int m, int n) {
         ArrayList<Integer> list =new ArrayList<>();
         for(int i=0;i<m;i++){
             for(int j=0;j<n;j++){
                 list.add(matrix[i][j]);
             }
         }
         Collections.sort(list);
         return (m*n/2);
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4, 5},
            {8, 9, 11, 12, 13},
            {21, 23, 25, 27, 29}
        };
        int m = matrix.length, n = matrix[0].length;
        int ans = median(matrix, m, n);
        System.out.println("The median element is: " + ans);
    }
}
//optimal
import java.util.*;
class tUf {
    static int upperBound(int[] arr, int x, int n) {
        int low = 0, high = n - 1;
        int ans = n;
        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] > x) {
                ans = mid;
                // look for a smaller index on the left
                high = mid - 1;
            } else {
                low = mid + 1; // look on the right
            }
        }
        return ans;
    }

    static int countSmallEqual(int[][] matrix, int m, int n, int x) {
        int count=0;
        for(int i=0;i<m;i++){
            count+=upperBound(matrix[i],x,n);
        }
       return count;
    }

    static int median(int[][] matrix, int m, int n) {
         int low=Integer.MAX_VALUE;
         int high=Integer.MIN_VALUE;
         int req=(m*n)/2;
         for (int i = 0; i < m; i++) {
            low = Math.min(low, matrix[i][0]);
            high = Math.max(high, matrix[i][n - 1]);
        }
         while(low<=high){
             int mid=(low+high)/2;
             int smallerEquals=countSmallEqual(matrix,m,n,mid);
             if(smallerEquals<=req){
                 low=mid+1;
             }
             else{
                 high=mid-1;
             }
         }
         return low;
    }
}
