// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        String a="anagram";
        String b="anagram";
        
        char s[]=a.toCharArray();
        char t[]=b.toCharArray();
        
        Arrays.sort(s);
        Arrays.sort(t);
        
        if(Arrays.equals(s,t)){
            System.out.println("This is an anagram");
        }
       else{
           System.out.println("This is not an anagram");
       }
    }
}
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

//optimal
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int count[]=new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int c:count){
            if(c!=0){
                return false;
            }
            
        }
        return true;
    }
}
