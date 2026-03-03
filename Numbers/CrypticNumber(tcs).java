import java.util.*;
class Main{
    public static boolean palindrome(int n){
            int org=n;
            int rev=0;
            while(n>0){
                int digit=n%10;
                rev=rev*10+digit;
                n/=10;
            }
            if(org==rev){
                return true;
            }
            else{
                return false;
            }
        }
    public static boolean repeatedDigits(int n){
        int org=n;
        HashSet<Integer> set=new HashSet<>();
        while(n>0){
            int digit=n%10;
            if(set.contains(digit)){
                return true;
            }
                set.add(digit);
                n/=10;
        }
            return false;
        }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int r=sc.nextInt();
    
        while(l<r){
            if(l%7==0 && l%5!=0 && !palindrome(l) && !repeatedDigits(l)){
                System.out.println(l+" ");
            }
            l++;
        }
    }
}
