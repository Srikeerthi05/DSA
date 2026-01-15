import java.util.ArrayList;

class GFG {
    public static ArrayList<Integer> primeFactor(int n) {
       ArrayList<Integer> ans=new ArrayList<>();
       for(int i=2;i*i<=n;i++){
           while(n%i==0){
               ans.add(i);
               n=n/i;
           }
       }
       if (n > 1) {
            ans.add(n);
        }
       return ans;
    }
    public static void main (String[] args) {
        int n = 50;
        ArrayList<Integer> ans = primeFactor(n);
 
        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}
