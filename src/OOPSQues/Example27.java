
package OOPSQues;
// this code show error because we cannot override static metho
class shapess{
     static int l=10;
     static int b=8;
    static int  h=0;

    //error code
    //    public static  int calculateArea(){
//        return l*b*h;
//    }
}
class Rectangless extends shapess{
    int l=1;
    int b=8;

    public int calculateArea(){

        return l*b;
    }
}
class circless extends shapess{
    int p=3;
    int r=2;
    int k=1;

    public int calculateArea(){
        return p*r*k;
    }
}

public class Example27{
    public static void main(String[] args) {
        shape  c=new circle();
        c.calculateArea();
        shape r=new Rectangle();
        r.calculateArea();
    }
}


