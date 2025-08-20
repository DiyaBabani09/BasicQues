public class pattern{
public static void main(String args[]){
int n=7;

// pattern1
 /*for(int i=1;i<=n;i++) {

for(int j=1;j<=i;j++){


if(j==1|| j==i|| i==n){
System.out.print("*");

} else{
System.out.print(" ");

} 
}
System.out.println();
} */

//pattern2
for(int i=1;i<=n;i++) {

for(int j=1;j<=n-i;j++){

System.out.print(" ");
}
for(int k=1;k<=i;k++){
System.out.print("*");
}
System.out.println( );
} 

// pattern3 K pattern
for(int i=1;i<=2*n;i++) {
int row=i<=n?i:2*n-i+1;

for(int k=1;k<=row;k++){
if(k==(2*n)-i+1 || k==1){
System.out.print("*");
}
}
for(int j=1;j<=2*(n-row);j++){
System.out.print(" ");
}
for(int k=1;k<=row;k++){
if(k==row || k==(2*n)-i+1){
System.out.print("*");

}
}
System.out.println( );
}

System.out.println();

//pattern 4

for(int i=1;i<=2*n;i++) {
int row=i<=n?i:2*n-i+1;

for(int k=1;k<=row;k++){
System.out.print("*");
}
for(int j=1;j<=2*(n-row);j++){
System.out.print(" ");
}
for(int k=1;k<=row;k++){
System.out.print("*");
}
System.out.println( );
} 

System.out.println("pattern 5");

//pattern 5 cross

for(int i=1;i<=2*n-1;i++) {
int row=i<=n?i:2*n-i;

/*for(int k=1;k<=row;k++){
System.out.print("*");
} */
for(int j=1;j<=(2*n)-1;j++){
if(j==row||j==2*n-row){
System.out.print("*");
} else{
System.out.print(" ");
}
}

System.out.println( );
} 


System.out.println("pattern 6");
// pattern 6 triangle
for(int i=1;i<=n;i++) {
//int row=i<=n?i:2*n-i+1;
for(int j=1;j<=n-i;j++){
System.out.print(" ");
}

for(int k=1;k<=2*i-1;k++){
System.out.print("*");
}

System.out.println( );
} 
System.out.println("pattern 7");
// pattern 7 Hollow triangle
for(int i=1;i<=n;i++) {
for(int j=1;j<=n-i;j++){
System.out.print(" ");
}
for(int k=1;k<=2*i-1;k++){
if(k==1||k==2*i-1|| i==n){
System.out.print("*");
}
else{
System.out.print(" ");
}
}
System.out.println( );
} 

System.out.println("pattern 8");
// pattern 8 Diamond
for(int i=1;i<=2*n;i++) {
int row=i<=n?i:2*n-i+1;
for(int j=1;j<=n-row;j++){
System.out.print(" ");
}
for(int k=1;k<=2*row-1;k++){
if(k==1||k==2*row-1|| i==n){
System.out.print("*");
}
else{
System.out.print(" ");
}
}
System.out.println( );
} 



 

}
}
