//brute-force
import java.util.*;
public class tUf {
    public static boolean canWePlace(int stalls[],int d, int k){
        int n=stalls.length;
        int count=1;
        int lastCow=stalls[0];
        for(int i=1;i<n;i++){
            if(stalls[i]-lastCow>=d){
                count++;
                lastCow=stalls[i];
            }
        }
        if(count>=k){
            return true;
        }
        else{
            return false;
        }
    }
    public static int aggressiveCows(int[] stalls, int k) {
        int n=stalls.length;
        Arrays.sort(stalls);
        int max=stalls[n-1];
        int min=stalls[0];
        int min=Integer.MAX_VALUE;
        for(int i=1;i<=(max-min);i++){
            if(canWePlace(stalls,i,k)){
                continue;
            }
            else{
                return i-1;
            }
        }
        return max-min;
    }
    public static void main(String[] args) {
        int[] stalls = {0, 3, 4, 7, 10, 9};
        int k = 4;
        int ans = aggressiveCows(stalls, k);
        System.out.println("The maximum possible minimum distance is: " + ans);
    }
}

//optimal
import java.util.*;
public class tUf {
    public static boolean canWePlace(int stalls[],int d, int k){
        int n=stalls.length;
        int count=1;
        int lastCow=stalls[0];
        for(int i=1;i<n;i++){
            if(stalls[i]-lastCow>=d){
                count++;
                lastCow=stalls[i];
            }
        }
        if(count>=k){
            return true;
        }
        else{
            return false;
        }
    }
    public static int aggressiveCows(int[] stalls, int k) {
        int n=stalls.length;
        Arrays.sort(stalls);
        int low=1;
        int high=stalls[n-1];
        while(low<=high){
            int mid=(low+high)/2;
            if(canWePlace(stalls,mid,k)){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return high;
    }
    public static void main(String[] args) {
        int[] stalls = {4,2,1,3,6};
        int k = 2;
        int ans = aggressiveCows(stalls, k);
        System.out.println("The maximum possible minimum distance is: " + ans);
    }
}
