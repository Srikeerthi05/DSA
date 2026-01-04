//brute
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

//optimal-two pointer and Sliding window
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int maxLen=0;
        int hash[]=new int[256];
        Arrays.fill(hash,-1);
        int l=0;
        int r=0;
        while(r<n){
            if(hash[s.charAt(r)]!=-1&& hash[s.charAt(r)]>=l){
                l=hash[s.charAt(r)]+1;
            }
        int len=r-l+1;
        maxLen=Math.max(len, maxLen);
        hash[s.charAt(r)]=r;
        r++; 
    }
    return maxLen;
}
}
