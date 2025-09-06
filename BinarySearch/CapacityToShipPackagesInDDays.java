//brute force
class Solution {
    public int day(int weights[], int cap){
        int n=weights.length;
        int dayss=1;
        int load=0;
        for(int i=0;i<n;i++){
            if(load+weights[i]>cap){
                dayss=dayss+1;
                load=weights[i];
            }
            else{
                load+=weights[i];
            }
        }
        return dayss;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=weights[i];
            max=Math.max(max,weights[i]);
        }
        for(int i=max;i<=sum;i++){
            if(day(weights,i)<=days){
                return i;
            }
        }
        return -1;
    }
}
