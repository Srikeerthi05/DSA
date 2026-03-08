//brute
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int arr[][]=new int[n][2];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i][0]==arr[j][1] && arr[i][1]==arr[j][0]){
                    System.out.println(arr[j][0]+ ","+arr[j][1]);
                }
            }
        }
    }
}
