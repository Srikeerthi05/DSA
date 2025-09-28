//brute
class Solution {
    public int myAtoi(String s) {
        if(s.length()==0){
            return 0;
        }
        s=s.trim();
        int sign=1;
        int i=0;
        if(s.charAt(0)=='-' || s.charAt(0)=='+'){
            sign=(s.charAt(0)=='-')? -1:1;
            i++;
        }
        
        StringBuilder ans=new StringBuilder();
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            ans.append(s.charAt(i));
            i++;
        }
        if(ans.length()==0){
            return 0;
        }

        long num=Long.parseLong(ans.toString())*sign;

        if(num<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        else if(num>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        return (int)num;
    }
}

//optimal
class Solution {
    public int myAtoi(String s) {
        if(s.length()==0){
            return 0;
        }
        long res=0;
        int sign=1;
        int i=0;
        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }
            if(i==s.length()){
                return 0;
            }
            if(s.charAt(i)=='-'){
                sign=-1;
                i++;
            }
            else if(s.charAt(i)=='+'){
                i++;
            }
        

        while(i<s.length() && Character.isDigit(s.charAt(i))){
            int digit=s.charAt(i)-'0';
            res=res*10+digit;
            if(sign*res<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            if(sign*res>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            i++;
        }
        return (int)(sign*res);
    }
}
