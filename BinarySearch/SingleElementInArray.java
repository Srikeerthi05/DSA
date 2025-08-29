//brute force
class Main {
    public static int singleElement(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(i==0){
                if(arr[i]!=arr[i+1]){
                    return arr[i];
                }
            }
            else if(i==n-1){
                if(arr[i]!=arr[i-1]){
                    return arr[i-1];
                }
            }
            else{
                if(arr[i]!=arr[i+1] && arr[i]!=arr[i-1]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
