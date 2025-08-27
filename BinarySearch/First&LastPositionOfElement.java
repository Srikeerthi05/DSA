//brute force
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int first=-1;
        int last=-1;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                first=i;
                break;
            }
        }
        for(int j=n-1;j>=0;j--){
            if(nums[j]==target){
                last=j;
                break;
            }
        }
        return new int[]{first,last};
    }
}

//optimal
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=findFirst(nums,target);
        int last=findLast(nums,target);
        return new int[]{first,last};
    }
    public static int findFirst(int[] nums, int target){
        int n=nums.length;
        int low=0;
        int high=n-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                ans=mid;
                high=mid-1;
            }
            else if(target> nums[mid]){
            low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    public static int findLast(int[] nums, int target){
        int n=nums.length;
        int low=0;
        int high=n-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                ans=mid;
                low=mid+1;
            }
            else if(target> nums[mid]){
            low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
}
