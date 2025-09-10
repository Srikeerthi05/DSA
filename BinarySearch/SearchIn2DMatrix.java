//brute force
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        } 
        return false;
    }
}
//better
class Solution {
    public boolean binarySearch(int[] mat,int target){
        int l=mat.length;
        int low=0;
        int high=l-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(mat[mid]==target){
                return true;
            }
            else if(target<mid){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){ 
                if(matrix[i][0]<=target && target<=matrix[i][n-1]){
                    return binarySearch(matrix[i],target);
                }
        }
        return false;
    }
}
//optimal
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int low=0;
        int high=(n*m-1);
        while(low<=high){
            int mid=(low+high)/2;
            int row=mid/m;
            int col=mid%m;
            if(matrix[row][col]==target){
                return true;
            }
            else if(target<matrix[row][col]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return false;
    }
}
