import java.io.*;
class GFG {
    static boolean canPairs(int[] arr, int n)
    {
      if(n%2==1){
          return false;
      }
      int oddcount=0;
      int evencount=0;
      for(int i=0;i<n;i++){
          if(arr[i]%2==0){
              evencount++;
          }
          else{
              oddcount++;
          }
      }
       if(evencount%2==0 && oddcount%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args)
    {
        int[] arr = { 3, 2, 1, 4, 7, 5 };
        int N = arr.length; 
        if (canPairs(arr, N))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
