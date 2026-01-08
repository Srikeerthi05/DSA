class Solution {
    public int minFlips(String s) {
        int n=s.length();
        int flip1=0;
        int flip2=0;
        for(int i=0;i<n;i++){
            if(i%2==0 && s.charAt(i)!='0'){
                flip1++;
            }
            if(i%2!=0 && s.charAt(i)!='1'){
                flip1++;
            }
        }
        
        for(int i=0;i<n;i++){
            if(i%2==0 && s.charAt(i)!='1'){
                flip2++;
            }
            if(i%2!=0 && s.charAt(i)!='0'){
                flip2++;
            }
        }
        return Math.min(flip1,flip2);
    }
}
