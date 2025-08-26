package OOPSQues;
interface AurvedicMedicine{
    void auyurved();
}
interface HomopethicMedic{
    void Homopethic();
}
class medicine implements  AurvedicMedicine,HomopethicMedic{
    public void auyurved(){
        System.out.println("use ayurvedic medicine");
    }
    public void Homopethic(){
        System.out.println("use homopethic medicine");
    }
}
public class InterfaceExample2
{
    public static void main(String[] args) {
        medicine m=new medicine();
        m.auyurved();
        m.Homopethic();
    }

}
