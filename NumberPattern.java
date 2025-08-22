public class NumberPattern{

public static void main(String args[]){
int n=5;
for(int i=n;i>=1;i--){



int num=n-i+1;
for(int j=1;j<=i;j++){

if(i==n || num==n-i+1 || j==i){
System.out.print(num );
}else{
System.out.print(" ");
} 
num++;
}
System.out.println();
}
}
}
