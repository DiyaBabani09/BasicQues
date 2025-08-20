public class Armstrong{
public static void main(String args[]){
int n=153;
int arm=0;
int t1=n,t2=n;
//countdigit
int len=0;
while(t1!=0){
len++;
t1/=10;
}
System.out.println(len);
while(t2!=0){
int r=t2%10;
int sum=1;
for(int i=1;i<=len;i++)
{
sum*=r;
}
arm+=sum;
System.out.println(sum);

t2/=10;
}
if(arm==n){
System.out.println("no Is Armstrong");
} 
else{
System.out.println("not Armstrong");
}
}
}

