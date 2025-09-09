//brute and better are same as MedianOfTwoSortedArrays
//optimal
class Solution {
    public static int KthElement(int[] nums1, int[] nums2,int k) {
        int n1=nums1.length;
        int n2=nums2.length;
        if(n1>n2){
            return KthElement(nums2,nums1,k);
        }
        int n=n1+n2;
        int left=(n+1)/2;
        int low=Math.max(0,k-n2);
        int high=Math.min(k,n2);
        while(low<=high){
            int mid1=low+(high-low)/2;
            int mid2=left-mid1; 
            int l1= (mid1>0)?nums1[mid1-1]: Integer.MIN_VALUE;
            int l2=(mid2>0)?nums2[mid2-1]: Integer.MIN_VALUE;
            int r1=(mid1<n1)?nums1[mid1]: Integer.MAX_VALUE;
            int r2=(mid2<n2)? nums2[mid2]: Integer.MAX_VALUE;

            if(l1<=r2 && l2<=r1){
                    return Math.max(l1,l2); 
            }
            else if(l1>r2){
                high=mid1-1;
            }
            else{
                low=mid1+1;
            }
        }
        return 0;
    }
    public static void main(String args[]){
        int nums1[]={2,3,6,7,9};
        int nums2[]={1,4,8,10};
        int k=4;
        int ans=KthElement(nums1,nums2,k);
        System.out.println(ans);
    }
}
