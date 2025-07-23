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
