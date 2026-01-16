class spynumber {
    static int digitSum(int n){
        int temp=n;
        int sum=0;
        while(temp>0){
            int d=temp%10;
            sum+=temp;
            temp/=10;
        }
        return sum;
    }
    static int digitProduct(int n){
        int temp=n;
        int prod=1;
        while(temp>0){
            int d=temp%10;
            prod*=temp;
            temp/=10;
        }
        return prod;
    }
    public static void main(String[] args) {
        int n=112;
        int s=digitSum(n);
        int p=digitProduct(n);
        if(s==p){
            System.out.println("Yes");
        }
        else{
            System.out.println("no");
        }
    }
}
