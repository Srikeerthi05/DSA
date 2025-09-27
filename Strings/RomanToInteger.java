class Solution {
    public int value(char c){
        switch(c){
            case 'I': return 1;
            case 'V':return 5;
            case 'X': return 10;
            case 'L':return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
    public int romanToInt(String s) {
        int n=s.length();
        int res=0;
        for(int i=0;i<n;i++){
            int curr=value(s.charAt(i));
            if(i+1<n && curr< value(s.charAt(i+1))){
                res-=curr;
            }
            else{
                res+=curr;
            }
        }
        return res;  
    }
}
