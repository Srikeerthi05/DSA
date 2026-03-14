//brute
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int czero=0;
        int cone=0;
        int ctwo=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                czero++;
            }
            else if(arr[i]==1){
                cone++;
            }
            else{
                ctwo++;
            }
        }
        
        for(int i=0;i<czero;i++){
            arr[i]=0;
        }
        for(int j=czero;j<cone;j++){
            arr[j]=1;
        }
        for(int k=cone;k<ctwo;k++){
            arr[k]=2;
        }
        for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
        }
    }
}
//dutch flag
class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int j=0;
        int k=nums.length-1;
        while(j<=k){
            if(nums[j]==0){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
                j++;
            }
            else if(nums[j]==2){
                int temp=nums[k];
                nums[k]=nums[j];
                nums[j]=temp;
                k--;
            }
            else{
                j++;
            }
        }
    }
}
