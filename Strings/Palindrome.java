//brute-O(n^2)
public static boolean isPalindrome(String s) {
    String rev = "";

    for (int i = s.length() - 1; i >= 0; i--) {
        rev += s.charAt(i);
    }

    return s.equals(rev);
}
//Optimal-O(n)
class Main {
    public static boolean palindrome(String s){
        int n=s.length();
        int l=0;
        int r=n-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s="reber";
        System.out.println(palindrome(s));
    }
}
