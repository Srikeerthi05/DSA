//optimal
class Solution {
    public static int max(int[][] mat,int n, int m ,int col){
        int max=-1;
        int idx=-1;
        for(int i=0;i<n;i++){
            if(mat[i][col]>max){
                max=mat[i][col];
                idx=i;
            }
        }
        return idx;
    }
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int low=0;
        int high=m-1;
        while(low<=high){
            int mid=(low+high)/2;
            int row=max(mat,n,m,mid);
            int left;
            int right;
            if(mid-1>=0){
                left=mat[row][mid-1];
            }
            else{
                left=-1;
            }
            if(mid+1<m){
                right=mat[row][mid+1];
            }
            else{
                right=-1;
            }

            if(mat[row][mid]> left && mat[row][mid]> right){
                return new int[]{row,mid};
            }
            else if(mat[row][mid]<left){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return new int[]{-1,-1};        
    }
}
