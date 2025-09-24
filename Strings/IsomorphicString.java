class Solution {
    public boolean isIsomorphic(String s, String t) {
        int lastSeens[]=new int[256];
        int lastSeent[]=new int[256];
        for(int i=0;i<=s.length()-1;i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            if(lastSeens[ch1]!=lastSeent[ch2]){
                return false;
            }
            lastSeens[ch1]=i+1;
            lastSeent[ch2]=i+1;
        }
        return true;
    }
}
