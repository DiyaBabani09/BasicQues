public class Lcm{
public static void main(String args[]){
int a=12;
int b=8;
int lcm=1;
int c=Math.max(a,b);
for(int i=2;i<a*b;i++){
if(i%a==0 && i%b ==0){
lcm=i;
break;
}
}
System.out.println(lcm);
}
}
