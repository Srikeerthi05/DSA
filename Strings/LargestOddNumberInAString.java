//brute-force
class Solution {
    public String largestOddNumber(String num) {
        int n=num.length();
        String ans="";
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String subStr=num.substring(i,j+1);
                char last=subStr.charAt(subStr.length()-1);
                if((last-'0')%2==1){
                    if(ans.equals("") || subStr.length()>ans.length() || 
                    subStr.length()==ans.length() && subStr.compareTo(ans)>0){
                        ans=subStr;
                    }
                }
            }
        }
        return ans;
    }
}
