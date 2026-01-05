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


//optimal
import java.util.*;
public class Solution {
    public static int lengthOfLongestSubstringKDistinct(String s, int k) {
        int n=s.length();
        int maxLen=0;
        int l=0;
        int r=0;
        HashMap<Character, Integer> map=new HashMap<>();
        while(r<n){
            char ch=s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.size()>k){
                char left=s.charAt(l);
                map.put(left,map.get(left)-1);
                if(map.get(left)==0){
                    map.remove(left);
                }
                l++;
            }
                maxLen=Math.max(maxLen, r-l+1);
                r=r+1;
        }
        return maxLen;
        
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
