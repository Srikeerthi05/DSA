class Main {
    public static int NthRoot(int n,int m){ //n=3, m=27
        int low=1; 
        int high=m;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(Math.pow(mid,n)<=m){
                ans= mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=3;
        int m=27;
        System.out.println(NthRoot(n,m));
    }
}
