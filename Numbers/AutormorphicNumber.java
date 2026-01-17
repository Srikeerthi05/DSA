class Main {
    public static void main(String[] args) {
    int n=25;
    int sq=n*n;
    int temp=n;
    while(temp>0){
        int digit=temp%10;
        int digit1=sq%10;
        if(digit==digit1){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        temp=temp/10;
        sq=sq/10;
    }
    }
}
