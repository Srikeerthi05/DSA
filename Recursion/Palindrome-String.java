import java.io.*;
import java.util.Arrays;
class Test {
  static private boolean isPalindrome(String s) {
    int l=0;
    int r=s.length()-1;
    while(l<r){
        char left=s.charAt(l);
        char right=s.charAt(r);
        if(!Character.isLetterOrDigit(left)){
            l++;
        }
        else if(!Character.isLetterOrDigit(right)){
            r--;
        }
        else if(Character.toLowerCase(left)!=Character.toLowerCase(right)){
            return false;
        }
        else{
            l++;
            r--;
        }
    }
    return true;
  }
  public static void main(String[] args) {
    String str = "ABCDCBA";
    boolean ans = isPalindrome(str);

    if (ans == true) {
      System.out.println("Palindrome");
    } else {
      System.out.println("Not Palindrome");
    }
  }
}
