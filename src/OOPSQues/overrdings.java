package OOPSQues;
class animal{
    public void eat(){
        System.out.println("eats");
    }
}
class deer extends animal{
    public void eat(){
        System.out.println("eats grass");
    }
}
public class overrdings {
    public static void main(String[] args) {
deer d=new deer();
d.eat();
animal d2=new deer();
d2.eat();

    }
}
