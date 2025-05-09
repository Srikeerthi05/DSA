class Solution {
    public int calculate(String s) {
        int sign=1;
        int currNo=0;
        int ans=0;
        Stack<Integer> stack=new Stack<>();
          
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(Character.isDigit(ch)){
                currNo=currNo*10 + (ch-'0');
                
            }
            else if(ch=='+'){
                ans=ans+sign*currNo;
                currNo=0;
                sign=1;
            }
            else if(ch=='-'){
                ans=ans+sign*currNo;
                currNo=0;
                sign=-1;
            }
            else if(ch=='('){
                stack.push(ans);
                stack.push(sign);
                ans=0;
                sign=1;
            }
            else if(ch==')'){
                ans=ans+sign*currNo;
                currNo=0;
                ans=ans*stack.pop();
                ans=ans+stack.pop();
            }
        }
        if(currNo!=0){
            ans+=sign*currNo;
        }
        return ans;
    }

}
