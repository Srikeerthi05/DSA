//brute force
class Solution {
    public boolean palindrome(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int n=s.length();
        String longest="";
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String sub=s.substring(i,j+1);
                if(palindrome(sub) && sub.length()>longest.length())
                longest=sub;
            }
        }
        return longest;
    }
}
