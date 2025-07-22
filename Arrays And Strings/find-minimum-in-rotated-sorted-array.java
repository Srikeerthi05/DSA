class Solution {
    public int findMin(int[] nums) {
        int left=0;
        int right=nums.length-1;
        while(left < right){
            int mid=left+(right-left)/2;
            if(nums[mid]>nums[right]){
                left=mid+1;
            }
            else{
                right =mid;
            }
            
        }
        
         return nums[left];
    }
}




// brute force
public class Solution {
    public static int findMin(int[] nums) {
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return min;
    }
    public static void main(String args[]){
        int nums[]={12,3,2,0,1};
        System.out.println(findMin(nums));
    }
}
