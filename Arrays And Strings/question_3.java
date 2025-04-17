class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result=new ArrayList<>();
        for (int i=0;i<nums.length;i++){
            while(nums[i]!=nums[nums[i]-1]){
                int ci=nums[i]-1;
                int temp=nums[i];
                nums[i]=nums[ci];
                nums[ci]=temp;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                result.add(i+1);
            }
        }
        return result;
    }
}
