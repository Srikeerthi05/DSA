class Solution {
    public void swap(int nums[],int i,int j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;  
        }
    public void reverse(int nums[],int i,int j){
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int pivot=-1;
        //1)find pivot
      for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivot=i;
                break;
            }
        }
        if(pivot==-1){
                reverse(nums,0,n-1);
                return;
        }
      //2)find right most element greater than pivot and swap them
        for(int i=n-1;i>pivot;i--){
            if(nums[i]>nums[pivot]){
                swap(nums,i,pivot);
                break;
            }
        }  
      //3)reverse the right part 
        reverse(nums,pivot+1,n-1);
    }
}
