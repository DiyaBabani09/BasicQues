public class String2{
public static void main(String args[]){
String str="java is programming language and java    used as Backednd";
String str2 ="test is 1234 with no";
String newstr=str.replace("java","python");
String newstr2=str.replaceAll("java","python");
String newstr3=str.replaceAll("\\s+", " ");

String newstr4=str2.replaceAll("\\d","");
System.out.println(newstr);
System.out.println(newstr2);
System.out.println(newstr3);
System.out.println(newstr4);



}
}








