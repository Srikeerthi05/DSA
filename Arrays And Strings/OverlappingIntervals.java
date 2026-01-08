class Solution {
    public ArrayList<int[]> mergeOverlap(int[][] arr) {
        // Code here
        Arrays.sort(arr,(a,b)->(a[0]-b[0]));
        int temp[]=new int[2];
        temp[0]=arr[0][0];
        temp[1]=arr[0][1];
        ArrayList<int[]> ar=new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            if(temp[1]>=arr[i][0]){
                temp[1]=Math.max(temp[1],arr[i][1]);
            }
            else{
                ar.add(temp);
                temp=arr[i];
            }
        }
        ar.add(temp);
        return ar;
    }
}
