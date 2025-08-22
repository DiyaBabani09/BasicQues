
//package comm.diyaBabani;

public class UniquePattern{

public static void main(String args[]){
int n=5;
for(int i=n;i>=n;i--){



for(int j=n-i+1;j<=i;j++){
if(i==n ||j==i|| j==n-i+1){
System.out.print(j+ " ");
}
System.out.print(" ");
}
System.out.println();
}
}
}
