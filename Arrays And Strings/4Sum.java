//brute -O(n^4)
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length;
        HashSet<List<Integer>> set=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    for(int l=k+1;l<n;l++){
                        if(nums[i]+nums[j]+nums[k]+nums[l]==target){
                            List<Integer> list=Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                             Collections.sort(list);
                             set.add(list);
                        }
                    }
                }
            }
        }
       return new ArrayList<>(set);
    }
}
