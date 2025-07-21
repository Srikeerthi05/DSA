import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> found=Arrays.asList(nums[i],nums[j],nums[k]);
                        Collections.sort(found);
                        res.add(found);
                    }
                }
            }
        }
       return new ArrayList<>(res); 
    }
    public static void main(String args[]){
      Solution s = new Solution();
        int[] nums = {-1, 0, 1, 2, -1, -4}; // ✅ Correct syntax
        List<List<Integer>> ans = s.threeSum(nums);
        System.out.println(ans);
    }
}
