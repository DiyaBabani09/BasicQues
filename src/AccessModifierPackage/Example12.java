package AccessModifierPackage;
import OOPSQues.Example10;

public class Example12  extends Example10{
    //it will override but cannot use default and private
      protected void show(){
        System.out.println("example12");
    }
    public static void main(String[] args) {
        System.out.println("protected only access on subclass ");

        Example12 e=new Example12();
        e.show();
    }
}
