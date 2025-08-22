// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void printArray(int arr[],int n){
        System.out.println("Reversed Array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverse(int arr[],int i,int j){
        if(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
           reverse(arr,i+1,j-1);
        }
    }
    public static void main(String[] args) {
        int n=5;
       int arr[]={5,4,3,2,1};
       reverse(arr,0,n-1);
       printArray(arr,n);
    }
}
