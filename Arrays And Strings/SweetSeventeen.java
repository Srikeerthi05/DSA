import java.util.;
class Main {
public static void main(String[] args) {
Scanner sc=new Scanner([System.in](http://system.in/));
System.out.print("Enter your number: ");
String str=sc.next();
int res=0;
int base=17;
for(int i=0;i<str.length();i++){
int val=0;
char ch=str.charAt(i);
if(Character.isDigit(ch)){
val=ch-'0';
}
else{
val=ch-'A'+10;
}
res=resbase+val;
}
System.out.println(res);
}
}
