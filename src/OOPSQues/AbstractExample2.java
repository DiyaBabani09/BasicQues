package OOPSQues;
abstract class C{
    String color;
    C(){
        System.out.println(" C class constructor");
    }
    abstract void display();
    void showclass(){
        System.out.println("class A");
    }
}
class D extends C{
    D(){
        System.out.println("D class Constructor");
    }
    void display(){
        System.out.println("on class B");
    }
    void changecolor(){
        System.out.println("Red");
    }
}
class E extends D{
    E(){
        System.out.println("E constructor");
    }

        }
public class AbstractExample2 {
    public static void main(String[] args) {
        E e=new E(); // it will call print constructor of all classes
//        B b=new B();
//        System.out.println(b.color); // its show parent class constructor
//        b.display();
//        b.showclass();
//        b.changecolor();
    }
}



