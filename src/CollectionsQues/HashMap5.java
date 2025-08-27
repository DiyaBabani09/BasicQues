package CollectionsQues;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
import java.util.Map;

public class HashMap5 {
    public static void main(String[] args) {
        HashMap<Integer,String>m=new HashMap<>();
        ArrayList <Integer> l=new ArrayList<>(m.keySet());
        m.put(1,"hi");
        m.put(9,"hello");
        m.put(6,"gm");
        m.put(0,"gn");

        Collections.sort(l);
       for(Map.Entry<Integer,String>e :m.entrySet()){
           System.out.println(e.getKey()+ " : " + e.getValue());
       }

    }


}
