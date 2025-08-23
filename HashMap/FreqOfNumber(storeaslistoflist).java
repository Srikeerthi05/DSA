import java.util.*;
class Solution {
    public static List<List<Integer>> countFrequencies(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<List<Integer>> res=new ArrayList<>();
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            List<Integer> pair=new ArrayList<>();
            pair.add(e.getKey());
            pair.add(e.getValue());
            res.add(pair);
        }
        return res;
    }
    public static void main(String args[]){
        int nums[]={1,2,3,3,2,1,5,6,7,7,6,5};
        System.out.println(countFrequencies(nums));
    }
}
