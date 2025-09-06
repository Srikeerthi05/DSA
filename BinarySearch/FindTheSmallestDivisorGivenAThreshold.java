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
