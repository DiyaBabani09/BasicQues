
//permuatation in string by using window approach


public class String3{
public static void main(String args[]){
String s1="abcd";
String s2="eiabdcae";
int ws=s1.length();
int freq[]=new int[26];
for(int i=0;i<s1.length();i++){
freq[s1.charAt(i)-'a']++;
}
boolean found=false;
for(int i =0;i<s2.length()-ws;i++){
int idx=0;
for(int j=0;j<ws;j++){
if(freq[s2.charAt(j)-'a']!=0){
idx++;
}
}
if(idx==s1.length()){
found= true;
}
}
System.out.println(found);

}
}
