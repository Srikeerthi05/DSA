class Solution {
    public boolean isPalindrome(int x) {
        int dup=x;
        int rev=0;
        while(x>0){
            int a=x%10;
            rev=rev*10+a;
            x=x/10;
        }
        if(dup==rev){
            return true;
        }
        else{
            return false;
        }
        
    }
}
