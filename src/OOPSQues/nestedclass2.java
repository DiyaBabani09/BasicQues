package OOPSQues;

class outerclass {
    static int x = 1;
    int y = 5;
    private static int z = 2;


     class innerclass {
        public void display() {
            System.out.println(x);
            System.out.println(z);
            // access directly


            System.out.println(y);
        }
    }
}
public class nestedclass2 {
    public static void main(String[] args) {
        outerclass o=new outerclass();
        outerclass.innerclass i =o.new innerclass();

        i.display();
    }
}
