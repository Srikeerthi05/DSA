//for sorted array only.
class Solution {
    int countZeroes(int[] arr) {
        // code here
        int l=0;
        int h=arr.length-1;
        int count=0;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==0){
                count+=(mid-l)+1;
                l=mid+1;
                
            }
            else{
                h=mid-1;
            }
        }
        return count;
    }
}
