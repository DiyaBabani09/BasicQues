public class intersection{
public static void main(String args[]){
int arr[]={1,2,3,4,5};
int arr2[]={2,4,6,7,8};
int n=arr.length;
int m=arr2.length;
int i=0;
int j=0;
while(i<n&&j<m){
if(arr[i]<arr2[j]){

i++;
}
if(arr[i]>arr2[j]){
j++;

}else{
System.out.println(arr[i]);
i++;
j++;
}

}
}

}
