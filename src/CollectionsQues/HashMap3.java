package CollectionsQues;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class H{
    int id;

    String name;
    H(int id,String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        H h = (H) o;
        return id == h.id && Objects.equals(name, h.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class HashMap3 {
    public static void main(String[] args) {
        HashMap<H,Integer>m=new HashMap<>();
        H h=new H(1,"diya");
        H h1=new H(2,"Priya");
        H h2=new H(1,"diya");
        m.put(h,10);
        m.put(h1,20);
        m.put(h2,30);

        // without overrirde it show 10 ,30
        System.out.println(m.get(h));
        System.out.println(m.get(h2));
//        for(H i:m.keySet()){
//            System.out.println(m.get(i));
//        }
        System.out.println(m.size());


    }
}
