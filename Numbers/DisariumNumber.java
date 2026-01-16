import java.util.*;
class Main {
    static int countDigits(int n){
         return String.valueOf(n).length();
    }
    public static void main(String[] args) {
        int n=153;
        int temp=n;
        int sum=0;
        int count=countDigits(n);
        while(temp>0){
            int digit=temp%10;
            sum=sum+(int)Math.pow(digit, count);
            temp/=10;
        }
        if(sum== n){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
