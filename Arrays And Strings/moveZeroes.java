class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int left=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                left=i;
                break;
            }
        }
        if(left==-1){
            return ;
        }
        int right=left+1;
        while(right<n){
            if(nums[left]==0 && nums[right]!=0){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
                right++;
            }
           else{
                right++;
            }
        }
    }
}
