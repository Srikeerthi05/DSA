class Solution {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) {
        // Your code here
        int prefixsum[]=new int[arr.length];
        prefixsum[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]==0){
                return true;
            }
            prefixsum[i]=prefixsum[i-1]+arr[i];
        }
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(hs.contains(prefixsum[i])|| prefixsum[i]==0){
                return true;
            }
            else{
                hs.add(prefixsum[i]);
            }
        }
        return false;
    }
}
