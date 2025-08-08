class Solution {
    public char findKthBit(int n, int k) {
        if(k==1){
            return '0';
        }
         int m=(int)Math.pow(2,n)-1;
         int mid=(m+1)/2;

         if(k==mid){
            return '1';
         }

        else if(k<mid){
            return findKthBit(n-1,k);
         }
         else{

            char flip=findKthBit(n-1,m-k+1);
            return (flip=='0')?'1':'0';
         }
                     
    }
}
