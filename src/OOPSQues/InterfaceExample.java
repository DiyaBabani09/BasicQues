package OOPSQues;
interface player{
    void moves();
}

class Queen implements player{
public void moves(){
    System.out.println("up, down");
}}
public class InterfaceExample {
    public static void main(String[] args) {
Queen q=new Queen();
q.moves();
}
}


