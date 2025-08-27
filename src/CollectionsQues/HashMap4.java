package CollectionsQues;

import java.util.HashMap;
// SEARCHING IN hASHmAP
public class HashMap4 {
    public static void main(String[] args) {
        HashMap<Integer, String> m = new HashMap<>();
        m.put(1, "hi");
        m.put(5, "hello");
        m.put(6, "gm");
        m.put(0, "gn");

       int target =9;

            if (m.containsKey(target)) {
                System.out.println("found");
                System.out.println(m.get(target));
            } else {
                System.out.println("not found");
            }


    }
}
