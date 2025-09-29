//bruteforce
class Solution {
    public int beautySum(String s) {
        int n=s.length();
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String sub=s.substring(i,j+1);
                int beauty=0;
                    

        int freq[]=new int[26];
        for(char c:sub.toCharArray()){
            freq[c-'a']++;
        }

        int max=0;
        int min=Integer.MAX_VALUE;
        for(int f:freq){
            if(f>0){
                max=Math.max(max,f);
                min=Math.min(min,f);
            }

        }
        beauty=max-min;
        sum+=beauty;
     }
    }
    return sum;
}
}
