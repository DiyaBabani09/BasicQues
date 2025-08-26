package OOPSQues;
//mutilevel inheritance
class Person {
    String name;



    public void speaking() {
        System.out.println("Hi");
    }
}
class Employees extends Person{


    public void working(){
        System.out.println("java Developer");
    }
}
   class student extends Employees{
        public void stuyding(){
            System.out.println("studying");
        }
   }

public class Humans{
    public static void main(String[] args) {
        //Human h=new Human("diya");
         student e= new student();
        e.speaking();
        e.working();
        e.stuyding();


    }
}

