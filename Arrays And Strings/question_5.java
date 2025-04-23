class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // int m=nums.length;
        // int a[]=new int[m];
        // for (int i=0;i<m;i++){
        //     int count =0;
        //     for(int j=0;j<m;j++){
        //         if(nums[j]<nums[i]){
        //             count++;
        //         }
        //     }
        //     a[i]=count;
        // }
        //   return a;

        // using count sort
        int count[]=new int[101];
        for (int n:nums]{
            count[n]++;
    }
    for(int i=1;i<101;i++){
        count[i]+=count[i-1];
    }
    int res=new int[n.length];
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            if(num==0){
                res[i]=0;
            }
            else{
                res[i]=count[n-1];
            }
        return res;
        }
