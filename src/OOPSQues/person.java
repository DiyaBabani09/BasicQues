package OOPSQues;
//inheritence with super keyword;

class Human {
    String name;

    Human(String name) {
        this.name = name;
    }

    public void YourName() {
        System.out.println("your name is " + name);
    }
}
    class Employee extends Human{
        Employee(String name){
            super(name);
        }

        public void working(){
            System.out.println("java Developer"+name);
        }
    }
//    class student extends Human{
//        public void stuyding(){
//            System.out.println("studying");
//        }
//    }

public class person {
    public static void main(String[] args) {
        //Human h=new Human("diya");
        Employee e= new Employee("diya");
        e.YourName();
        e.working();


    }
}
