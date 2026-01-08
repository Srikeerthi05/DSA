class Solution {
    public ArrayList<Integer> prefSum(int[] arr) {
        // code here
        int n=arr.length;
        ArrayList<Integer> prefix= new ArrayList<>();
        int sum=0;
        for(int num:arr){
            sum+=num;
            prefix.add(sum);
        }
        return prefix;
    }
}
