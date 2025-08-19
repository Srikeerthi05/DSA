// optimal solution
class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int n=nums.length;
        int actual=(n*(n+1))/2;
        for (int i=0;i<n;i++){
            sum+=nums[i];
        }
        int miss=actual-sum;
        return miss;
        
    }
}

// brute force
class Solution{
    public int missingNumber(int[] nums){
        int n=nums.length;
        for(int i=0;i<=n;i++){
            boolean found=false;
            for(int j=0;j<n;j++){
                if(nums[j]==i){
                    found=true;
                    break;
                }
            }
            if(!found){
                return i;
            }
        }
        return -1;
    }
}
