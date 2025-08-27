package CollectionsQues;
import java.util.HashMap;
public class HashMap2 {
    public static void main(String[] args) {
        HashMap<Integer,String>m=new HashMap<>();
        m.put(1,"hi");
        m.put(5,"hello");
        m.put(6,"gm");
        m.put(0,"gn");

        // Modifiying
        m.put(5,"Hey");
        for(int i:m.keySet()){
            System.out.println(m.get(i));
        }

    }

}
