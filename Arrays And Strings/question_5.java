class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int m=nums.length;
        int a[]=new int[m];
        for (int i=0;i<m;i++){
            int count =0;
            for(int j=0;j<m;j++){
                if(nums[j]<nums[i]){
                    count++;
                }
            }
            a[i]=count;
        }
          return a;
    }
   
}
