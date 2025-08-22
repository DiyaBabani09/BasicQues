class Solution {
    public static int beautySum(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
        int freq[]=new int[26];

            for(int j=i;j<s.length();j++){
                freq[s.charAt(j)-'a']++;
                int b= beauty(freq);
                sum+=b;


            }
        }
        return sum;
    }
    public static int beauty(int arr[]){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
min=Math.min(min,arr[i]);
        }
max=Math.max(max,arr[i]);
        //for(int i=0;i<26;i++){
       
        
       }
        int res =max  - min;
        System.out.println(res);
        return res;
    }

public static void main(String args[]){

String str="aabcb";
int output =beautySum(str);
System.out.println(output);



}




}







