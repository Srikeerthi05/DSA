//brute force
class Solution {
    public boolean possible(int[] bloomDay,int day ,int m, int k){
        int n=bloomDay.length;
        int count=0;
        int noofB=0;
        for(int i=0;i<n;i++){
            if(bloomDay[i]<=day){
                count++;
            }
            else{
                noofB+=(count/k);
                count=0;
            }
        }
        noofB+=(count/k);
        if(noofB>=m){
            return true;
        }
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(bloomDay[i],max);
            min=Math.min(bloomDay[i],min);
        }
        for(int i=min;i<=max;i++){
            if(possible(bloomDay,i,m,k)){
                return i;
            }
        }
        return -1;   
    }
}

//optimal
class Solution {
    public boolean possible(int[] bloomDay,int day ,int m, int k){
        int n=bloomDay.length;
        int count=0;
        int noofB=0;
        for(int i=0;i<n;i++){
            if(bloomDay[i]<=day){
                count++;
            }
            else{
                noofB+=(count/k);
                count=0;
            }
        }
        noofB+=(count/k);
        if(noofB>=m){
            return true;
        }
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if(n<((long)m*k)){
            return -1;
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(bloomDay[i],max);
            min=Math.min(bloomDay[i],min);
        }
       int low=min;
       int high=max;
       while(low<=high){
        int mid=low+(high-low)/2;
        if(possible(bloomDay,mid,m,k)){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
       }
        return low; 
    }
}
