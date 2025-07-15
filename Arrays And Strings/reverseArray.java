 
class Main {
    public static void reverseArr(int arr[]){
        int n=5;
        int temp[]=new int[5];
        for(int i=0;i<n;i++){
            temp[i]=arr[n-i-1];
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
    }
  //two pointers-swap
  public static void reverseArr(int arr[]){
       int l=0;
       int r=arr.length-1;
       while(l<r){
           int temp=arr[l];
           arr[l]=arr[r];
           arr[r]=temp;
           
           l++;
           r--;
       }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
       reverseArr(arr);
       for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
