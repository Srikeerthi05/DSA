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
