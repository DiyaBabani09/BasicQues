public class frequency{
public static void main(String args[]){

int arr[]={1,2,3,7,7,8,7,9,7,7,0,7,7};
int max=Integer.MIN_VALUE;
for(int i=0;i<arr.length;i++){
int count=1;

for(int j=i+1;j<arr.length;j++){
if(arr[i]==arr[j]){
count++;
}
}
if(count>=max){
max=count;
}

}
System.out.println(max);

}
}


