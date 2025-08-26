package OOPSQues;
class S{
    String name;
    String age;
    S(String name,String age){
        this.name=name;
        this.age=age;
    }
}
public class Example7 {
    public static void main(String[] args) {
        S s=new S("diya","20");
        System.out.println(s.toString()); // it print  hashcode in string format
    }



}
