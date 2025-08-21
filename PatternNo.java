public class PatternNo{
public static void main(String args[]){
int n=7;
System.out.println("pattern1");
for(int i=1;i<=n;i++){
for(int j=1;j<=i;j++){
System.out.print(j);
}
System.out.println();

}

System.out.println("pattern2");
for(int i=1;i<=n;i++){
for(int k=1;k<=n-i;k++){
System.out.print(" ");
}
for(int j=1;j<=i;j++){
System.out.print(j);
}
System.out.println();

}


System.out.println("pattern3");
for(int i=1;i<=n;i++){
for(int k=1;k<=n-i;k++){
System.out.print(" ");
}
for(int j=1;j<=i;j++){
System.out.print(j+ " " );
}
System.out.println();

} 

System.out.println("pattern4");
for(int i=n;i>=1;i--){
for(int k=1;k<=n-i;k++){
System.out.print(" ");
}
for(int j=1;j<=i;j++){
System.out.print(j);
}
System.out.println();

}


System.out.println("pattern5");
for(int i=n;i>=1;i--){
for(int k=1;k<=n-i;k++){
System.out.print(" ");
}
for(int j=1;j<=i;j++){
System.out.print(j+ " " );
}
System.out.println();

}

System.out.println("pattern6");
for(int i=1;i<=2*n;i++){
int row=i<=n? i:2*n-i;
for(int k=1;k<=n-row;k++){
System.out.print(" ");
}
for(int j=1;j<=row;j++){
System.out.print(j);
}
System.out.println();

}

System.out.println("pattern7");
for(int i=1;i<=2*n;i++){
int row =i<=n? i:2*n-i;
for(int k=1;k<=n-row;k++){
System.out.print(" ");
}
for(int j=1;j<=row;j++){
System.out.print(j+ " " );
}
System.out.println();

}









System.out.println("pattern8");
for(int i=2*n;i>=1;i--){
int row =i<=n? n-i+1:i-n;
for(int k=1;k<=n-row;k++){
System.out.print(" ");
}
for(int j=1;j<=row;j++){
System.out.print(j+ " " );
}
System.out.println();

}



System.out.println("pattern9");
for(int i=1;i<=2*n;i++){
int row=i<=n? i:2*n-i;

for(int j=1;j<=row;j++){
System.out.print(j);
}
System.out.println();

}

System.out.println("pattern10");
int num=1;
for(int i=1;i<=n;i++){

for(int j=1;j<=i;j++){
System.out.print(num+ " " );
num++;
}
System.out.println();

}






















}
}
