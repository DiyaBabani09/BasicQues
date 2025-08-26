package OOPSQues;
// simple inheritance eaxmple
class Mammal{
    public void walk(){
        System.out.println("walking a animal");
    }
}
class  Dog extends Mammal{
    public void voice (){
        System.out.println(" barks");
    }        }
public class Animal {
    public static void main(String[] args) {
       Dog d=new Dog();
       d.walk();
       d.voice();

    }

}
