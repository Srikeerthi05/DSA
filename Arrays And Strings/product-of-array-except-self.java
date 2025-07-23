// brute force
class Solution {
    public static int[] productExceptSelf(int[] nums) {
         
        int n=nums.length;
        int ans[]=new int[n];
        for(int i=0;i<nums.length;i++){
            int prod=1;
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    prod*=nums[j];
                }
             ans[i]=prod;
            }
    }
    return ans;
    }

    // optimized
    import java.util.*;
class Solution {
    public static int[] productExceptSelf(int[] nums) {
        int prod=1;
        int n=nums.length;
        int ans[]=new int[n];
        int prefix[]=new int[n];
        int suffix[]=new int[n];
        prefix[0] = 1;
        suffix[n - 1] = 1;
       for(int i=1;i<nums.length;i++){
           prefix[i]=prefix[i-1]*nums[i-1];
       }
       for(int i=n-2;i>=0;i--){
           suffix[i]=suffix[i+1]*nums[i+1];
       }
        for(int i=0;i<nums.length;i++){
           ans[i]=prefix[i]*suffix[i];
       }

    return ans;
    }
    public static void main(String args[]){
        int nums[] = {1, 2, 3, 4};
        int[] result = productExceptSelf(nums);
        System.out.println(Arrays.toString(result)); 
    }
}
