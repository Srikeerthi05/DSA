class Solution {
    public int maxProduct(int[] nums) {
        int ms=Integer.MIN_VALUE;
        int cs=1;
        for(int i=0;i<nums.length;i++){
            cs=cs*nums[i];
             
            ms=Math.max(cs,ms);
        }
        return ms;
    }
}
