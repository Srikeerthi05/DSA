class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        StringBuilder ans=new StringBuilder();
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[n-1];
        for(int  i=0;i<Math.min(first.length(),last.length());i++){
            if(first.charAt(i)==last.charAt(i)){
                ans.append(first.charAt(i));
            }
            else{
                break;
            }
        }
        return ans.toString();
    }
}
