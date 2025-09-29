//brute-force
class Solution {
    public int maxDepth(String s) {
        Stack<Character> stk=new Stack<>();
        int maxD=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                stk.push(c);
                maxD=Math.max(maxD,stk.size());
            }
            else if(c==')'){
                stk.pop();
            }
        }
        return maxD;
    }
}

//optimal
class Solution {
    public int maxDepth(String s) {
        int curr=0;
        int max=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                curr++;
                max=Math.max(curr,max);
            }
            else if(ch==')'){
                curr--;
            }
        }
        return max;
    }
}
