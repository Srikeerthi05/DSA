//brute force-1
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
}


//brute force 2
class Main {
    public static int singleElement(int arr[]){
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++){
            ans=ans^arr[i];
        }
        return ans;
    }
}

//optimal
class Main {
    public static int singleElement(int arr[]){
        int n=arr.length;
        if(n==1){
            return arr[0];
        }
        if(arr[0]!=arr[1]){
            return arr[0];
        }
        if(arr[n-1]!=arr[n-2]){
            return arr[n-1];
        }
        int low=1;
        int high=n-2;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]!=arr[mid+1] && arr[mid]!=arr[mid-1]){   //check left and right of mid
                return arr[mid];
            }
            if(mid%2==0 && arr[mid]==arr[mid+1] || mid%2==1 && arr[mid]!=arr[mid-1]){  //if mid is even,check next element OR if mid is odd,check previous element
                low=mid+1;
            }
            else{
            high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,1,3,5,5};
        System.out.println(singleElement(arr));
    }
}
