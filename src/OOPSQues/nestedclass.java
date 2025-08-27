package OOPSQues;
class outer {
    static int x = 9;
    int y = 5;
    private static int z = 2;


    static class inner {
        public void display() {
            System.out.println(x);
            System.out.println(z);
            // cannot access directly
            outer o = new outer();

            System.out.println(o.y);
        }
    }
}
public class nestedclass {
    public static void main(String[] args) {
outer.inner i=new outer.inner();
i.display();
    }
}
