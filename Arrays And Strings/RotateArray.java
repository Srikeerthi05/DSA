//brute force
class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n; //to avoid unnecessary full rotations
        for(int i=0;i<k;i++){
            int temp=nums[n-1];
            for(int j=n-1;j>0;j--){
                nums[j]=nums[j-1];
            }
            nums[0]=temp;
        }  
    }
}
