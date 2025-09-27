//method-1
class Solution {
    public String frequencySort(String s) {
        int freq[]=new int[128];
        for(char ch:s.toCharArray()){
            freq[ch]++;
        }
        Character chars[]=new Character[s.length()];
        for(int i=0;i<s.length();i++){
            chars[i]=s.charAt(i);
        }

        Arrays.sort(chars,(a,b)->{
            if(freq[a]==freq[b]){
                return a-b;
            }
            return freq[b]-freq[a];
        }
        );

        StringBuilder ans=new StringBuilder();
        for(char c: chars){
            ans.append(c);
        }
        return ans.toString();
        
    }
}
