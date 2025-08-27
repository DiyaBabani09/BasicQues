
package OOPSQues;
class shapes{
    int l=10;
    int b=8;
    int h=0;
    public int calculateArea(){
        return l*b*h;
    }
}
class Rectangles extends shapes{
    int l=1;
    int b=8;

    public int calculateArea(){
        super.calculateArea();
       return l*b;
    }
}
class circles extends shapes{
    int p=3;
    int r=2;
    int k=1;

    public int calculateArea(){
        super.calculateArea();
        return p*r*k;
    }
}

public class Example26{
    public static void main(String[] args) {
        shape  c=new circle();
        c.calculateArea();
        shape r=new Rectangle();
        r.calculateArea();
    }
}

