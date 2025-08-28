class Solution {
    public boolean search(int[] nums, int target) {
         int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                return true;
            }
            if(nums[low]==nums[mid] && nums[mid]==nums[high]){ //only change made 
                low=low+1;
                high=high-1;
            }
            if(nums[low]<=nums[mid]){
                if(target>=nums[low] && target<nums[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(target>nums[mid] && target<=nums[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
       if(nums[low]==target){
        return true;
       }
       else{
        return false;
       }
    }
}
