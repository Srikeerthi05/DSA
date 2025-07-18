class Solution {
    public int maxProduct(int[] nums) {
        int ms=Integer.MIN_VALUE;
        int cs=1;
        for(int i=0;i<nums.length;i++){
            cs=cs*nums[i];
             ms=Math.max(cs,ms);
            if(cs==0){
                cs=1;
            }
             
            
        }
        cs=1;
        for(int i=nums.length-1;i>=0;i--){
            cs=cs*nums[i];
             ms=Math.max(cs,ms);
            if(cs==0){
                cs=1;
            }
             
            
        }
        return ms;
    }
}
