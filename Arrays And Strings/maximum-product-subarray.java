class Solution {
    public int maxProduct(int[] nums) {
        int mp=Integer.MIN_VALUE;
        int cp=1;
        for(int i=0;i<nums.length;i++){
            cp=cp*nums[i];
             mp=Math.max(cs,ms);
            if(cp==0){
                cp=1;
            }
             
            
        }
        cp=1;
        for(int i=nums.length-1;i>=0;i--){
            cp=cp*nums[i];
             ms=Math.max(cp,mp);
            if(cp==0){
                cp=1;
            }
             
            
        }
        return mp;
    }
}
