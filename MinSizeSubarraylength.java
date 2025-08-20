public class MinSizeSubarraylength{
public static void main(String args[]){
int arr[]={2, 3, 1, 2, 4, 3};

int min= Integer.MAX_VALUE;
int target=7;
int value=0;
for(int i=0;i<arr.length;i++){
int sum=0;

for(int j=i;j<arr.length;j++){

sum+=arr[j];
if(sum>=target){
value=j-i+1;
min=Math.min(min,value);
break;
}
}
//System.out.println(value);
}

System.out.println(min);
}
}

