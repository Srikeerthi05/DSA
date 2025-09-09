//brute force
import java.util.*;
public class tUf {
    public static int rowWithMax1s(int[][] matrix, int n, int m) {
      int maxCount=-1;
      int index=-1;
      for(int i=0;i<n;i++){
          int count=0;
          for(int j=0;j<m;j++){
              count+=matrix[i][j];
          }
          if(count>maxCount){
              maxCount=count;
              index=i;
          }
      }
      return index;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 1, 1},
            {0, 0, 1},
            {0, 0, 0}
        };
        int n = 3, m = 3;
        System.out.println("The row with the maximum number of 1's is: " +rowWithMax1s(matrix, n, m));
    }
}

//optimal
import java.util.*;
public class tUf {
    public static int lowerBound(int arr[],int n, int x){
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=x){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public static int rowWithMax1s(int[][] matrix, int n, int m) {
      int maxCount=-1;
      int index=-1;
      for(int i=0;i<n;i++){
          int count=m-lowerBound(matrix[i],m,1);
          if(count>maxCount){
              maxCount=count;
              index=i;
          }
      }
      return index;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 1, 1},
            {0, 0, 1},
            {0, 0, 0}
        };
        int n = 3, m = 3;
        System.out.println("The row with the maximum number of 1's is: " +rowWithMax1s(matrix, n, m));
    }
}

