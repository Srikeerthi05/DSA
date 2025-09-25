//brute force
class Solution {
    public String sort(String str){
        char c[]=str.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
    public boolean isAnagram(String s, String t) {
            if(s.length()!=t.length()){
                return false;
            }
            String str1=sort(s);
            String str2=sort(t);
            for(int i=0;i<s.length();i++){
                if(str1.charAt(i)!=str2.charAt(i)){
                    return false;
                }
            }
            return true;
    }
}
