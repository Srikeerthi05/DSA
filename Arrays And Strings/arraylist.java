import java.util.*;
class ArrayList1{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int lines=sc.nextInt();
       ArrayList<ArrayList<Integer>> ll=new ArrayList<>();
       for (int i=0;i<lines;i++){
        int size=sc.nextInt();
        ArrayList<Integer>l=new ArrayList<>();
        for(int j=0;j<size;j++){
            int k=sc.nextInt();
             l.add(k);
        }
        ll.add(l);    
        }
        int q=sc.nextInt();
        for(int m=0;m<q;m++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            try {
                System.out.println(ll.get(a-1).get(b-1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }

       

    }
}
