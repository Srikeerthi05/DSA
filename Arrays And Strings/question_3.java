//optimal
class Solution{
    public List<Integer> findDisappearedNumbers(int[] nums){
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i])-1;
            if(nums[index]>0){
                nums[index]=-nums[index];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                res.add(i+1);
            }
        }
        return res;
    }
}

//brute force
// class Solution {
//     public List<Integer> findDisappearedNumbers(int[] nums) {
//         List<Integer> res=new ArrayList<>();
//         for (int i=0;i<nums.length;i++){
//             while(nums[i]!=nums[nums[i]-1]){
//                 int ci=nums[i]-1;
//                 int temp=nums[i];
//                 nums[i]=nums[ci];
//                 nums[ci]=temp;
//             }
//         }
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]!=i+1){
//                 res.add(i+1);
//             }
//         }
//         return res;
//     }
// }
