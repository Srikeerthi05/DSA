class Main {
    public static int count(int n){
        int temp=n;
        int count=0;
        while(temp>0){
            count++;
            temp/=10;
        }
        return count;
    }
    public static void main(String[] args) {
        int n=45;
        int sq=n*n;
        int div=1;
        int cnt=count(n);
        for(int i=0;i<cnt;i++){
            div*=10;
        }
        int r=sq%div;
        int l=sq/div;
        if(l+r==n){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
