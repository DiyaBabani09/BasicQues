package OOPSQues;
class toStringExample{
    String name;
    String age;
    toStringExample(String name,String age){
        this.name=name;
        this.age=age;
    }
    public String  toString(){
     return "name :"+name +"  age ; "+ age;
    }
}
public class Example8 {
    public static void main(String[] args) {
        toStringExample s=new toStringExample("diya","20");
        System.out.println(s.toString()); // it print  convert the object into string format
    }



}
