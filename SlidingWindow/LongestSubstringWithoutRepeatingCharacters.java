//brute-two pointer
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            int hash[]=new int[256];
            Arrays.fill(hash, 0);
            for(int j=i;j<n;j++){
                if(hash[s.charAt(j)]==1){
                    break;
                }
                hash[s.charAt(j)]=1;
                int len=j-i+1;
                maxLen=Math.max(len, maxLen);
            }
        }
        return maxLen;
    }
}
