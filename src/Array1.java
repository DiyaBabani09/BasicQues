public class Array1{
//quick sort
public static int pivot(int arr[],int s,int e){
int pi=arr[e];
 int i=s-1;
 for(int j=s;j<=e-1;j++){
 if(arr[j]<=pi){
 i++;
 int temp=arr[i];
 arr[i]=arr[j];
 arr[j]=temp;
}
}

 int temp=arr[i+1];
 arr[i+1]=arr[e];
 arr[e]=temp;
 return i+1;
}

public static void quick(int arr[],int s,int e){

if(s<e){
 int p=pivot(arr,s,e);
quick(arr,s,p-1);
quick(arr,p+1,e);

}
}
public static void main(String args[]){
int arr[]={5,4,3,2,1};

// remove duplicates
/*Arrays.sort(arr);
for(int i=0;i<arr.length-1;i++){

if(arr[i]!=arr[i+1]){
System.out.print(arr[i]+ " ");

}

}

System.out.println(arr[arr.length-1]);

*/
   
//quick sort 
 quick(arr,0,arr.length-1);
for(int i=0;i<arr.length;i++){
System.out.println(arr[i]);
   
   
  

}
}
}
