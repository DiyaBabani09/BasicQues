package OOPSQues;
class poly{
   public void sum(int a,int b){
       System.out.println(a+b);
   }
    public void sum(float a,int b){
        System.out.println(a+b);
    }
    public void sum(int a,double b){
        System.out.println(a+b);
    }
}
public class Calculator {
    public static void main(String[] args) {
poly p=new poly();
p.sum(3,5);
        p.sum(3,5.9);
        p.sum((float)3.3,5); // beacuse it automatically take double that why needs typecast


    }
}
