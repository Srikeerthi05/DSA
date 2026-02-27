//brute
import java.util.*;
class Main {
public static void main(String[] args) {
Scanner sc=new Scanner([System.in](http://system.in/));
int arr[]={4,1,0,5,6,7};
int temp[]=new int[arr.length];
int index=0;
for(int i=0;i<arr.length;i++){
if(arr[i]!=0){
temp[index]=arr[i];
index++;
}
}
for(int j=0;j<temp.length;j++){
arr[j]=temp[j];
}
int nonzero=index;
for(int k=nonzero;k<arr.length;k++){
arr[k]=0;
}
System.out.println(Arrays.toString(arr));
}
}
//optimal
class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int left=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                left=i;
                break;
            }
        }
        if(left==-1){
            return ;
        }
        int right=left+1;
        while(right<n){
            if(nums[left]==0 && nums[right]!=0){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
                right++;
            }
           else{
                right++;
            }
        }
    }
}
