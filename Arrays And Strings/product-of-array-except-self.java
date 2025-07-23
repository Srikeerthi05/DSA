// brute force
class Solution {
    public static int[] productExceptSelf(int[] nums) {
        int prod=1;
        int n=nums.length;
        int ans[]=new int[n];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    prod*=nums[j];
                }
             ans[i]=prod;
            }
    }
    return ans;
    }
