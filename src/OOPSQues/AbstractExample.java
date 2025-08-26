package OOPSQues;
abstract class A{
    String color;
    A(){
color="brown";
    }
    abstract void display();
    void showclass(){
        System.out.println("class A");
    }
}
class B extends A{
    void display(){
        System.out.println("on class B");
    }
    void changecolor(){
        System.out.println("Red");
    }
}
public class AbstractExample {
    public static void main(String[] args) {
        B b=new B();
        System.out.println(b.color); // its show parent class constructor
        b.display();
        b.showclass();
        b.changecolor();
    }
    }

