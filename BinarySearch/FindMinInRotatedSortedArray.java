class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>=nums[low]){
                ans=Math.min(nums[low],ans);
                low=mid+1;
            }
            else{
                ans=Math.min(nums[low],nums[mid]);
                high=mid-1;
            }
        }
       return ans; 
    }
}
