package OOPSQues;
class construct{
    String rollno;
    int id;
    construct(){
        System.out.println("Default constructor");
    }
    construct(String rollno){
        this.rollno=rollno;
        System.out.println("rollno");
    }
    construct(int id){
        this();
        this.id=id;
        System.out.println(id);
    }

}
public class Example4 {
    public static void main(String[] args) {
construct c=new construct(1);
    }
}
