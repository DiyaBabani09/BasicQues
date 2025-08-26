package OOPSQues;

abstract class car1{
    String name;
    static{
        System.out.println("1");
    }
    public car1(String name){
        super();
        System.out.println("2");
    }
    {
        System.out.println("3");
    }
}

public class Car  extends car1{
    {
        System.out.print("4");
    }
    public Car(){
        super("blue");
        System.out.println("5");
    }

    {
        System.out.print("6");
    }
    public static void main(String[] args) {
new Car();
    }
}
