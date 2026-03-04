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
//better
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        String a="anagram";
        String b="nagaram";
        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
            for(int j=0;j<b.length();j++){
                char s=b.charAt(j);
                    if(map.containsKey(s)){
                        map.put(s, map.get(s)-1);
                    }
                   
            }
            boolean flag=false;
            for(int value: map.values()){
                if(value!=0){
                    flag=false;
                }
                else{
                    flag=true;
                }
            }
            if(flag){
                System.out.println("Is an anagram");
            }
            else{
                System.out.println("Is not an anagram");
            }
        
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
