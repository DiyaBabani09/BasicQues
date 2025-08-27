package OOPSQues;
interface  company
{
    void project();
        }

        class Manager implements company{
    public void project(){
        System.out.println("e-commerce");
    }
        }
public class Example28 {
    public static void main(String[] args) {
Manager m=new Manager();
m.project();
    }
}
