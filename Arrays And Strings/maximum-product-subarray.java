class Main {
    public static int maxProduct(int[] nums) {
        int mp=Integer.MIN_VALUE;
        int cp=1;
        for(int i=0;i<nums.length;i++){
            cp=cp*nums[i];
             mp=Math.max(cp,mp);
            if(cp==0){
                cp=1;
            }     
        }
        cp=1;
        for(int i=nums.length-1;i>=0;i--){
            cp=cp*nums[i];
             mp=Math.max(cp,mp);
            if(cp==0){
                cp=1;
            }
        }
        return mp;
    }
    
    public static void main(String args[]){
        int nums[]={2,3,5,1};
        System.out.println(maxProduct(nums));
        }   
}
