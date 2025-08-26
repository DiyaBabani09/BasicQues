package OOPSQues;
// heirachial inheritance
class Driver{
public int speed=100;
public void display(){
    System.out.println("speed is  "+ speed);
}
}
class car extends Driver{
public void color(){
        System.out.println("blue");
    }
}
class taxi extends Driver{
public void color(){
    System.out.println("yellow");
}
}
public class Vechile {
    public static void main(String[] args) {
car c=new car();
c.display();
c.color();
taxi t =new taxi();
t.display();
t.color();

    }
}
