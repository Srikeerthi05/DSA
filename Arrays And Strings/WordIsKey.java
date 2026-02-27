import java.util.*;
class Main {
public static void main(String[] args) {
Scanner sc=new Scanner([System.in](http://system.in/));
System.out.println("Enter the word:");
String str=sc.next();
String keywords[]={
"break", "case", "continue", "default", "defer", "else","for", "func", "goto", "if", "map", "range", "return", "struct", "type", "var"
};
boolean isKeyword=false;
for(String s:keywords){
if(str.isequals(s)){
isKeyword=true;
break;
}
}
if(isKeyword){
System.out.println(str+" is a keyword");
}
else{
System.out.println(str+" is not a keyword");
}
}
}
