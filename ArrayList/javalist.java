import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         ArrayList<Integer> ll=new ArrayList<>();
         int n=sc.nextInt();
         
         for(int i=0;i<n;i++){
            ll.add(sc.nextInt());
         }
         System.out.println(ll);
         System.out.println("Enter queries:");
         int q=sc.nextInt();
         
         for(int i=0;i<q;i++){
            System.out.println("Enter string:");
            String s=sc.next();
            if(s.equals("Insert")){
                int index=sc.nextInt();
                int value=sc.nextInt();
                ll.add(index,value);
            }
            else if(s.equals("Delete")){
                int index1=sc.nextInt();
                ll.remove(index1);
            }
         }
         System.out.println(ll);
    }
}
