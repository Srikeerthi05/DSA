import java.util.;
class Main {
public static void main(String[] args) {
Scanner sc=new Scanner([System.in](http://system.in/));
System.out.println("Enter the steps:");
int n=sc.nextInt();
int x=0;
int y=0;
for(int i=1;i<=n;i++){
int distance =i10;
if(i%4==1){
x+=distance;
}
else if(i%4==2){
y+=distance;
}
else if(i%4==3){
x-=distance;
}
else{
y-=distance;
}
}
System.out.println(x+" "+y);
}
}
