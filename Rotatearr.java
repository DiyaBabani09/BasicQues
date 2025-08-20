public class Rotatearr{
public static void rotate(int arr[],int k){
int temp[]=new int[k];
int n=arr.length;
for(int i=0;i<k;i++){

temp[i]=arr[n-k+i];

}
//for(int i=0;i<n-k;i++){
//arr[k+i]=arr[i];

//}
 for (int i = n - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i];
        }
for(int i=0;i<temp.length;i++){
arr[i]= temp[i];

}
}
public static void main(String args[]){
int nums[]={1,2,3,4,5,6,7};
int k=3;
rotate(nums,k);

for(int i=0;i<nums.length;i++){
System.out.print(nums[i]+" ");


}



}

}
