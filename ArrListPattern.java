
import java.util.ArrayList;
import java.util.Scanner;

public class ArrListPattern{
public static void main(String args[]){

//created all pattern in one arraylist

Scanner sc=new Scanner(System.in);
System.out.println("enter the no");
// pattern1
int n=sc.nextInt();
ArrayList<String>p=new ArrayList<>(11);


p.add("pattern1");
p.add("\n");

for(int i=1;i<=n;i++){
for(int j=1;j<=n;j++){
if(i==1|| j==1||j==n||i==n){
p.add("*");

}
else{
p.add(" ");
}
}
p.add("\n");
}

//for(String S:p){
//System.out.print(S);

//}



p.add("pattern2");
 p.add("\n");

//ArrayList<String>p=new ArrayList<>(11);

for(int i=1;i<=n;i++){
for(int j=1;j<=i;j++){

p.add("*");
}
for(int k=1;k<=2*(n-i);k++){

p.add(" ");
}
for(int l=i;l>=1;l--){
p.add("*");
}
p.add("\n");
}















p.add("pattern3(Diamond)");
 p.add("\n");

//ArrayList<String>p=new ArrayList<>(11);

for(int i=1;i<=2*n;i++){
int row=i<=n?i:2*n-i;
for(int s=1;s<=n-row;s++){
p.add(" ");
}
for(int j=1;j<=2*row-1;j++){

p.add("*");
}


p.add("\n");
}



p.add("pattern4(K)");
 p.add("\n");

//ArrayList<String>p=new ArrayList<>(11);

for(int i=1;i<=2*n-1;i++){
int row=i<=n?i:2*n-i;
//for(int s=1;s<=n-row;s++){
//p.add(" ");
//}
for(int j=1;j<=n-row+1;j++){

p.add("*");
}

for(int k=row-n;k>=1;k++){
p.add("*");
}
p.add("\n");
}


p.add("pattern5(Reverse Triangle)");
 p.add("\n");

//ArrayList<String>p=new ArrayList<>(11);

for(int i=n;i>=1;i--){

for(int s=1;s<=n-i;s++){
p.add(" ");
}
for(int j=i;j>=1;j--){

p.add("*"+ " ");
}


p.add("\n");
}

p.add("pattern6(Hollow Triangle)");
 p.add("\n");

//ArrayList<String>p=new ArrayList<>(11);

for(int i=n;i>=1;i--){

for(int s=1;s<=n-i;s++){
p.add(" ");
}
for(int j=i;j>=1;j--){
if(i==1||i==n|| j==i||j==1){
p.add("*");
}
else{
p.add(" ");

}
}
p.add("\n");
}


p.add("pattern7(Hollow Mid Triangle)");
 p.add("\n");

//ArrayList<String>p=new ArrayList<>(11);

for(int i=n;i>=1;i--){

for(int s=1;s<=n-i;s++){
p.add(" ");
}
for(int j=1;j<=2*i-1;j++){
if(j==1||i==n|| j==(2*i-1)){
p.add("*");
}
else{
p.add(" ");

}
}
p.add("\n");
}

p.add("pattern8(hollow Diamond)");
 p.add("\n");

//ArrayList<String>p=new ArrayList<>(11);

for(int i=2*n;i>=1;i--){
int row=i<=n?i:2*n-i+1;
for(int s=1;s<=n-row;s++){
p.add(" ");
}
for(int j=1;j<=2*row-1;j++){
if(j==1||j==2*row-1){
p.add("*");
}
else{
p.add(" ");
}
}



p.add("\n");
}
for(String S:p){
System.out.print(S);

}


p.add("pattern9(hourglass)");
 p.add("\n");




for(int i=2*n;i>=1;i--){
int row=i>n?i-n:n-i+1;
for(int s=1;s<=n-row;s++){
p.add(" ");
}
for(int j=1;j<=2*row-1;j++){

p.add("*");
}


p.add("\n");
}


p.add("pattern10( Hollow hourglass)");
 p.add("\n");




for(int i=2*n;i>=1;i--){
int row=i>n?i-n:n-i+1;
for(int s=1;s<=n-row;s++){
p.add(" ");
}
for(int j=1;j<=2*row-1;j++){
if(j==1||j==2*row-1||row==n||row==1){

p.add("*");
}
else{
p.add(" ");
}
}


p.add("\n");
}
for(String S:p){
System.out.print(S);

}


}
}
