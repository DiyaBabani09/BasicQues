package OOPSQues;
class Money{
    int salary;
    int expenses;
    Money(int s,int e){
        salary =s;
        expenses=e;
    }
}
public class Example5 {
    public static void main(String[] args) {
Money m=new Money(5,6);
Money m2=new Money(5,6);
Boolean b=m.equals(m2);
        System.out.println(b);
    }
}
