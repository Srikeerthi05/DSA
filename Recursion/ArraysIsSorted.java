 class Main {
    public static boolean sorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return sorted(arr,i+1);

     // another way
      if(arr[i]<arr[i+1]){
            return sorted(arr,i+1);
        }
        else{
            return false;
        }//
    }
    
    public static void main(String[] args) {
        int arr[]={3,4,1,23};
        System.out.println(sorted(arr,0));
         
    }
}
