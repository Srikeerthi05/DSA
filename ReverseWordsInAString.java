//brute force
class Solution {
    public String reverseWords(String s) {
        s+=" ";
        Stack<String> stk=new Stack<String>();
        String str="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                if(!str.equals("")){
                stk.push(str);
                }
                str="";
            }
            else{
                str+=s.charAt(i);
            }
        }
        if(!str.equals("")){
            stk.push(str);
        }
        String ans="";
        while(stk.size()!=1){
            ans+=stk.peek()+" ";
            stk.pop();
        }
        ans+=stk.peek();
         return ans;
    } 
}
