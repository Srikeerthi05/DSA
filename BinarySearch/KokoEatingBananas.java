//brute-force
import java.util.*;
public class tUf {
    public static int findMax(int[] v) {
        int maxi=Integer.MIN_VALUE;
        int n=v.length;
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,v[i]);
        }
        return maxi;
    }
    public static int calculateTotalHours(int[] v, int hourly) {
        int totalH=0;
        int n=v.length;
        for(int i=0;i<n;i++){
            totalH+=(int)Math.ceil((double)(v[i])/(double)(hourly));
        }
        return totalH;
    }
    public static int minimumRateToEatBananas(int[] v, int h) { 
        int maxi=findMax(v);
        for(int i=1;i<=maxi;i++){
            int reqTime=calculateTotalHours(v,i);
            if(reqTime<=h){
                return i;
            }
        }
         
        return maxi;
    }
    public static void main(String[] args) {
        int[] v = {7, 15, 6, 3};
        int h = 8;
        int ans = minimumRateToEatBananas(v, h);
        System.out.println("Koko should eat at least " + ans + " bananas/hr.");
    }
}

//optimal
class Solution {
    public int maxi(int piles[]){
        int max=Integer.MIN_VALUE;
        int n=piles.length;
        for(int i=0;i<n;i++){
            max=Math.max(piles[i],max);
        }
        return max;
    }
    public int calcHours(int piles[],int speed){
        int total=0;
        int n=piles.length;
        for(int i=0;i<n;i++){
            total+=Math.ceil((double)(piles[i])/(double)speed);
        }
        return total;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int low=1;
        int high=maxi(piles);
        while(low<=high){
            int mid=low+(high-low)/2;
            int totalHrs=calcHours(piles,mid);
            if(totalHrs<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;  
    }
}
