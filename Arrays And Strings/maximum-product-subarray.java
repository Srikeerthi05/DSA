//brute
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int prod=1;
                for(int k=i;k<j;k++){
                    prod=prod*arr[k];
                }
                max=Math.max(max,prod);
            }
        }
        System.out.println("Maxim product of subarray : "+max);
    }
}
//better
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
             int prod=1;
            for(int j=i;j<n;j++){
                prod=prod*arr[j];
                max=Math.max(max,prod);
            }
        }
        System.out.println("Maxim product of subarray : "+max);
    }
}
//optimal
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int prefix=1;
        int suffix=1;
        for(int i=0;i<n;i++){
            if(prefix==0){
                prefix=1;
            }
            if(suffix==0){
                suffix=1;
            }
            prefix=prefix*arr[i];
            suffix=suffix*arr[n-i-1];
            
            max=Math.max(max, Math.max(prefix, suffix));
        }
        System.out.println("Maxim product of subarray : "+max);
    }
}
