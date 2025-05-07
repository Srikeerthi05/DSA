class Solution {
    public int evalRPN(String[] tokens) {
        int stack[]= new int[tokens.length];
        int i =0;
        for(String token: tokens){
            if(token.equals("+") || token.equals("-" )|| token.equals("*") || token.equals("/") ){
                int b=stack[--i];
                int a=stack[--i];
                switch(token){
                    case "+":
                    stack[i++]=a+b;
                    break;
                    case "-":
                    stack[i++]=a-b;
                    break;
                    case "*":
                    stack[i++]=a*b;
                    break;
                    case "/":
                    stack[i++]=a/b;
                    break;
                }
            }
            else{
            stack[i++]=Integer.parseInt(token);
            }
        }
        return stack[0];
    }
}
