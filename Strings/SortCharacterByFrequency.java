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

//method-2(Bucket Sort)
class Solution {
    public String frequencySort(String s) {
        int freq[]=new int[128];
        for(char ch:s.toCharArray()){
            freq[ch]++;
        }
        
        List<Character> buckets[]=new ArrayList[s.length()+1];
        for(int i=0;i<=s.length();i++){
            buckets[i]=new ArrayList<>();
        }

        for(char c=0;c<128;c++){
            if(freq[c]>0){
                buckets[freq[c]].add(c);
            }
        }

        StringBuilder sb=new StringBuilder();
        for(int i=s.length();i>=1;i--){
            for(char c:buckets[i]){
                for(int j=0;j<i;j++){
                    sb.append(c);
                }
            }
        }
       return sb.toString();
    }
}

