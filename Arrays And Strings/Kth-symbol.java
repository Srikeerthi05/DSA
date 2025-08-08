class Solution {
    public int kthGrammar(int n, int k) {
        StringBuilder r=new StringBuilder("0");
        for(int i=1;i<n;i++){
            StringBuilder next=new StringBuilder(r.length()*2);
            for(int j=0;j<r.length();j++){
                char c=r.charAt(j);
                if(c=='0'){
                    next.append("01");
                }
                else{
                    next.append("10");
                }
                
            }
             r=next;
        }
          
        return r.charAt(k-1)-'0';
    }
}
