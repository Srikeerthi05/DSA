class Solution {
    public int kthGrammar(int n, int k) {
        if(k==1){
            return 0;
        }
         int m=(int)Math.pow(2,n-1);
         int mid=m/2;
         if(k<=mid){
            return kthGrammar(n-1,k);
         }
         else{
            return 1-kthGrammar(n-1,k-mid);
         }
    }
}
