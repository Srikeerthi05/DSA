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

//another brute-force
class Solution {
    public String reverseWords(String s) {
        String[] str=s.trim().split("\\s+");
        String out="";
        for(int i=str.length-1;i>0;i--){
            out+=str[i]+" ";
        }
        return out+str[0];
    }
}

//optimal
 import java.io.*;
class Test{
static private String result(String s){ 
    String temp="";
    String ans="";
    int left=0;
    int right=s.length()-1;
    while(left<=right){
        char ch=s.charAt(left);
        if(ch!=' '){
            temp+=ch;
             
        }
        else if(ch==' '){
            if(!ans.equals("")){
                ans=temp+" "+ans;
            }
            else{
                ans=temp;
            }
            temp="";
        }
        left++;
    }
    if(!temp.equals("")){
        if(!ans.equals("")){
            ans=temp+" "+ans;
        }
        else{
            ans=temp;
        }
    }
    return ans;
}
