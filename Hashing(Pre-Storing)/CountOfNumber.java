class Main {
    public static void main(String[] args) {
        int arr[]={1,2,3,3,4,1,1 ,2};
        int q=1;
        int hash[]=new int[10];
        for(int i=0;i<arr.length;i++){
            hash[arr[i]]=hash[arr[i]]+1;
        }
        System.out.println(hash[q]);
    }
}
