//brute force
class Solution {
    public int maxi(int[] nums){
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
        }
        return max;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        int max=maxi(nums);
        for(int i=1;i<=max;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                sum+=Math.ceil((double)nums[j]/(double)i);
            }
            if(sum<=threshold){
                return i;
            }
        }
        return -1; 
    }
}

//optimal
class Solution {
    public int maxi(int[] nums){
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
        }
        return max;
    }
    public int div(int nums[],int d){
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=Math.ceil((double)nums[i]/(double)d);
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        if(n>threshold){
            return -1;
        }
        int max=maxi(nums);
        int low=1;
        int high=max;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(div(nums,mid)<=threshold){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        } 
        return low; 
    }
}
