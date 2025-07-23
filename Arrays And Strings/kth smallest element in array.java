// User function Template for Java

class Solution {
    public static int kthSmallest(int[] arr, int k) {
         Arrays.sort(arr);
         return arr[k-1];
        
    }
}
