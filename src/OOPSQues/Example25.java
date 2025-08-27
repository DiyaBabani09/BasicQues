package OOPSQues;
class shape{
    int l=10;
    int b=8;
    int h=0;
    public void calculateArea(){
        System.out.println(l*b*h);
    }
}
class Rectangle extends shape{
    int l=1;
    int b=8;

    public void calculateArea(){
        System.out.println(l*b);
    }
}
class circle extends shape{
    double p=3.14;
    int r=2;

    public void calculateArea(){
        System.out.println(p*r*r);
    }
}

public class Example25 {
    public static void main(String[] args) {
        shape  c=new circle();
        c.calculateArea();
        shape r=new Rectangle();
        r.calculateArea();
    }
}
