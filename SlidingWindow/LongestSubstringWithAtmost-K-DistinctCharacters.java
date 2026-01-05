//brute
import java.util.*;
public class Solution {
    public static int lengthOfLongestSubstringKDistinct(String s, int k) {
        int maxLen=0;
        int n= s.length();
        for(int i=0;i<n;i++){
            HashMap<Character, Integer> mpp= new HashMap<>();
            for(int j=i;j<n;j++){
                char ch=s.charAt(j);
                mpp.put(ch, mpp.getOrDefault(ch,0)+1);
                if(mpp.size()<=k){
                    maxLen=Math.max(maxLen,j-i+1);
                }
            }
            return maxLen;
        }
        return 0;
    }
    public static void main(String[] args) {
        String s1 = "eceba";
        int k1 = 2;
        System.out.println(lengthOfLongestSubstringKDistinct(s1, k1));
        String s2 = "aa";
        int k2 = 1;
        System.out.println(lengthOfLongestSubstringKDistinct(s2, k2)); 
    }
}
