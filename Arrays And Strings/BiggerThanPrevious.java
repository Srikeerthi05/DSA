import java.util.*;
class Main {
    public static void main(String[] args) {
        int arr[]={3,4,5,8,9};
        int count=1;
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
            count++;
            max=arr[i];
        }
    }
        System.out.println(count);
    }
}
