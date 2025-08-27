package CollectionsQues;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//java.util.Set;
public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String,Integer>m=new HashMap<>();
        m.put("agra",1);
        m.put("ajmer",2);

        m.put("jaipur",6);
        System.out.println(m);
        System.out.println(m.containsKey("agra"));
        System.out.println(m.containsValue(5));
        //Set<String> keys=m.keySet();
        for(String i:m.keySet()){
            System.out.println(m.get(i)+ " ");
        }
        for(Map.Entry<String,Integer>e: m.entrySet()){
            System.out.println(e.getKey().toUpperCase()+ " " + e.getValue());
        }
    }
}
