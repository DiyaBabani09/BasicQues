 
 import java.util.*;
 public class candies{
    public  static int distributeCandies(int[] c) {
        int totalcandie=c.length/2;
        Arrays.sort(c);
        int count =1;
        for(int i=0;i<c.length-1;i++){
            if(c[i]!=c[i+1]){
count++;
            }
        }
        if(count>totalcandie){
            return totalcandie;

        }else{
            return count;
        }

    }
    public static void main(String args[]){
    int arr[]={1,1,2,2,3,3};
    int ans=distributeCandies(arr);
    System.out.println(ans);
    }
}
