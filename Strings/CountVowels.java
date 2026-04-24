//brute-O(n)
class Main {
    public static int vowelcount(String s){
        int n=s.length();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s="elephant";
        System.out.println(vowelcount(s));
    }
}
