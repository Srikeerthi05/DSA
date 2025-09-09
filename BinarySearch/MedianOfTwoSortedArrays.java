//brute force
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int merge[]=new int[n+m];
        int k=0;
        for(int i=0;i<n;i++){
            merge[k++]=nums1[i];
        }
        for(int i=0;i<m;i++){
            merge[k++]=nums2[i];
        }
        Arrays.sort(merge);
        int total=merge.length;
        if(total%2==1){
            return(double) merge[total/2];
        }else{
            int middle1=merge[total/2-1];
            int middle2=merge[total/2];
            return ((double) middle1+(double) middle2)/2.0;
        }
    }
}

//better
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int p=m+n;
        int id1=p/2;
        int id2=(p/2)-1;
        int ele1=-1;
        int ele2=-1;
        int count=0;
        int i=0,j=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                    if(count==id1){
                        ele1=nums1[i];
                    }
                    if(count==id2){
                        ele2=nums1[i];
                    }
                    count++;
                    i++;
            }
            else{
                if(count==id1){
                    ele1=nums2[j];
                }
                if(count==id2){
                    ele2=nums2[j];
                }
                count++;
                j++;
            }
        }
         while (i < m) {
            if (count == id1) ele1 = nums1[i];
            if (count == id2) ele2 = nums1[i];
            count++;
            i++;
        }
        while (j < n) {
            if (count == id1) ele1 = nums2[j];
            if (count == id2) ele2 = nums2[j];
            count++;
            j++;
        }
        if(p%2==1){
            return (double)ele1;
        }
        else{
            return ((double)ele1+(double)ele2)/2;
        }
    }
}

//optimal
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        if(n1>n2){
            return findMedianSortedArrays(nums2,nums1);
        }
        int n=n1+n2;
        int left=(n+1)/2;
        int low=0;
        int high=n1;
        while(low<=high){
            int mid1=low+(high-low)/2;
            int mid2=left-mid1; 
            int l1= (mid1>0)?nums1[mid1-1]: Integer.MIN_VALUE;
            int l2=(mid2>0)?nums2[mid2-1]: Integer.MIN_VALUE;
            int r1=(mid1<n1)?nums1[mid1]: Integer.MAX_VALUE;
            int r2=(mid2<n2)? nums2[mid2]: Integer.MAX_VALUE;

            if(l1<=r2 && l2<=r1){
                if(n%2==1){
                    return Math.max(l1,l2);
                }
                else{
                    return ((double)(Math.max(l1,l2) + Math.min(r1,r2)))/2.0;
                }
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
}
