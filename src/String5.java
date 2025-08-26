
import java.util.*;
public class String5{
public static void main(String args[]){
 char chars[]={'a','a','b','b','c','c'};
StringBuilder res=new StringBuilder();
int i=0;
while(i<chars.length){
    char ch=chars[i];
    int count =0;
    while(i<chars.length && ch==chars[i]){
        count++;
        i++;
    }
    
    res.append(ch);
    
    if(count>1){
        res.append(count);
    }
}

    
    System.out.println(res);
}
}
