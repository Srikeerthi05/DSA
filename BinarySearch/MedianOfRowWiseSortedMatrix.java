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
