class Main {
    public static void main(String[] args) {
        String s="ababaa";
        char q='a';
        int hash[]=new int[27];
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)-'a']++;
        }
        System.out.println(hash[q-'a']);
    }
}
