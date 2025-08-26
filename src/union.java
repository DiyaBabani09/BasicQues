
import java.util.*;
public class union{
public static void main(String args[]){
int arr[]={1,2,3,4,5};
int arr2[]={2,4,6,7,8};
int n=arr.length;
int m=arr2.length;
int i=0;
int j=0;
while(i<n&&j<m){
if(arr[i]<arr2[j]){

System.out.println(arr[i]);
i++;
}
if(arr[i]>arr2[j]){

System.out.println(arr2[j]);
j++;

}else{
System.out.println(arr[i]);
i++;
j++;
}

}
while(i<n){
System.out.println(arr[i]);
i++;
}
while(j<m){
System.out.println(arr2[j]);
j++;
}




}

}
