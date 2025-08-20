public class Maxelementwindow{
public static void main(String args[]){
int arr[]={1, 3, -1, -3, 5, 3, 6, 7};
int output[]=new int[arr.length];
int ws=3;
for(int i=0;i<=arr.length-ws;i++){
int out=arr[i];
for(int j=i+1;j<ws+i;j++){
out=Math.max(out,arr[j]);
}
output[i]=out;
}
for(int i=0;i<=arr.length-ws+1;i++){

System.out.print(output[i]+ " ");
}
}
}

