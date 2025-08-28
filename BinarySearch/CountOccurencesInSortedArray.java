class Solution {
    public int countOccurrences(int[] arr, int target) {
        int first=firstOccurence(arr,target);
        if(first==-1){
            return -1;
        }
        int last=lastOccurence(arr,target);
        int count=(last-first)+1;
        return count;    
    }
     public static int firstOccurence(int arr[],int target){
            int n=arr.length;
            int l=0;
            int h=n-1;
            int ans=-1;
            while(l<=h){
                int mid=(l+h)/2;
                if(arr[mid]==target){
                    ans=mid;
                    h=mid-1;
                }
                else if(target<arr[mid]){
                    h=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            return ans;
         }
         public static int lastOccurence(int arr[],int target){
            int n=arr.length;
            int l=0;
            int h=n-1;
            int ans=-1;
            while(l<=h){
                int mid=(l+h)/2;
                if(arr[mid]==target){
                    ans=mid;
                    l=mid+1;
                }
                else if(target<arr[mid]){
                    h=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            return ans;
         }
}
