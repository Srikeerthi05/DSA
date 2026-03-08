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
//optimal
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
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int first=arr[i][0];
            int second=arr[i][1];
            if(map.containsKey(second) && map.get(second)==first){
                System.out.println(first+ "," +second);
            }
            else{
                map.put(first,second);
            }
        }
    }
}
