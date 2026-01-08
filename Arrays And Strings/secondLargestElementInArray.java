//optimal-O(n)
class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n=arr.length;
        int max=arr[0];
        int smax=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                smax=max;
                max=arr[i];
            }
            else if(arr[i]>smax && arr[i]<max){
                smax=arr[i];
            }
        }
        return smax;
    }
}
